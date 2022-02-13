package com.example.spring.starter.listener.run;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author dominiczhu
 * @version 1.0
 * @title AppRunListener
 * @date 2022/2/13 10:15 下午
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LogPropsAppRunListener implements SpringApplicationRunListener {


    public LogPropsAppRunListener(SpringApplication application, String[] args) {
    }
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
//        SpringApplicationRunListener.super.starting(bootstrapContext);

        System.setProperty("log.dir", System.getProperty("user.dir") + "/logs");

    }
}
