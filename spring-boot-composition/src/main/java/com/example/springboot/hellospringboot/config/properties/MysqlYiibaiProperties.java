package com.example.springboot.hellospringboot.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dominiczhu
 * @version 1.0
 * @title MysqlProperties
 * @date 2021/9/14 下午8:13
 */
@ConfigurationProperties(prefix = "spring.jdbc.datasource.druid.yiibaidb-properties")
@Data
public class MysqlProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

}
