package com.example.spring.starter.auto.config;

import com.example.spring.starter.druid.LogDruidFilterEventAdapter;
import com.example.spring.starter.web.ServerLogRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @author dominiczhu
 * @version 1.0
 * @title LogStarterAutoConfiguration
 * @date 2022/2/13 10:45 下午
 */
@Configuration
public class LogStarterAutoConfiguration {

    @Bean
    public LogDruidFilterEventAdapter druidFilterEventAdapter(){
        return new LogDruidFilterEventAdapter();
    }

    @Bean
    public ServerLogRequestFilter serviceLogRequestFilter(){
        return new ServerLogRequestFilter();
    }

    @Bean
    public FilterRegistrationBean<ServerLogRequestFilter> filterRegistrationBean(@Autowired ServerLogRequestFilter serverLogRequestFilter) {
        FilterRegistrationBean<ServerLogRequestFilter> registration = new FilterRegistrationBean();
        registration.setFilter(serverLogRequestFilter);
        registration.addUrlPatterns("/*");
        registration.setName("serviceLogRequestFilter");
        registration.setOrder(Ordered.LOWEST_PRECEDENCE);
        return registration;
    }

}
