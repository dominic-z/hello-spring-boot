package com.example.spring.starter.auto.config;

import com.example.spring.starter.druid.LogDruidFilterEventAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
