package com.example.spring.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dominiczhu
 * @version 1.0
 * @title Loggers
 * @date 2022/2/13 10:49 下午
 */
public class Loggers {

    public static final Logger SQL_LOG = LoggerFactory.getLogger("druid_sql");
    public static final Logger ERROR_LOG = LoggerFactory.getLogger("error");
}
