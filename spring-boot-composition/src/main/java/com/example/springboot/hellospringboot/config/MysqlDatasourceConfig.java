package com.example.springboot.hellospringboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.example.springboot.hellospringboot.config.properties.MysqlYiibaiProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author dominiczhu
 * @version 1.0
 * @title MysqlDatasourceConfig
 * @date 2021/9/14 下午8:12
 */
@Configuration
@EnableConfigurationProperties(MysqlYiibaiProperties.class)
public class MysqlDatasourceConfig {

    @Autowired
    private MysqlYiibaiProperties mysqlProperties;

    @ConfigurationProperties(prefix = "spring.jdbc.datasource.druid.yiibai")
    @Bean("yiibaiDatasource")
    public DataSource yiibaiDatasource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("yiibaiDatasource2")
    public DataSource yiibaiDatasourceByProperties(){
        DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
        druidDataSource.setDriverClassName(mysqlProperties.getDriverClassName());
        druidDataSource.setUrl(mysqlProperties.getUrl());
        druidDataSource.setUsername(mysqlProperties.getUsername());
        druidDataSource.setPassword(mysqlProperties.getPassword());
        return druidDataSource;
    }


}
