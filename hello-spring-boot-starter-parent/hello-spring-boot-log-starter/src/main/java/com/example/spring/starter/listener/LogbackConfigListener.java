package com.example.spring.starter.listener;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;

/**
 * @author dominiczhu
 * @version 1.0
 * @title LogbackConfigListener
 * @date 2022/2/13 4:50 下午
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LogbackConfigListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        try {

            LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

            final String config = "logback-spring.xml";

//            final URI uri = this.getClass().getClassLoader().getResource(config).toURI();

            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(lc);
            lc.reset();
            ClassPathResource resource = new ClassPathResource(config);
            configurator.doConfigure(resource.getInputStream());
        } catch (Exception e) {
            throw new RuntimeException("logback config error", e);
        }
    }
}
