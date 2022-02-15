package org.example.spring.starter.log.web;

import org.example.spring.starter.log.Loggers;
import org.example.spring.starter.log.utils.JacksonUtil;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author dominiczhu
 * @version 1.0
 * @title ServiceRequestFilter
 * @date 2022/2/14 9:54 上午
 */
public class ServerLogRequestFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {


        // 这个类的实现方式非常赞，因为这个HttpServletRequest一定会在某个地方对inputStream进行read
        // 那么就对InputStream的read进行包装，第一次读取的时候将结果缓存下来，然后第二次再读取的时候就重新生成一个stream
        // 包装类的典范
        final ContentCachingRequestWrapper reqWrapper = new ContentCachingRequestWrapper(request);
        final ContentCachingResponseWrapper respWrapper = new ContentCachingResponseWrapper(response);

        filterChain.doFilter(reqWrapper, respWrapper);

        final String srcAddr = reqWrapper.getRemoteAddr();
        final String method = reqWrapper.getMethod();
        final String formatReqBody =
                format(new String(reqWrapper.getContentAsByteArray(),
                        reqWrapper.getCharacterEncoding()));
        final Map<String, String[]> parameterMap = request.getParameterMap();

        final String formatParameterMap = format(JacksonUtil.MAPPER.writeValueAsString(parameterMap));

        final String formatRespBody =
                format(new String(respWrapper.getContentAsByteArray(), respWrapper.getCharacterEncoding()));
        Loggers.SERVER_LOG.info("{},{},{},{},{}", srcAddr, method, formatReqBody, formatParameterMap, formatRespBody);

        respWrapper.copyBodyToResponse();
    }

    private String format(String s) {
        return s.replaceAll(" +|\n|\r", "");
    }
}
