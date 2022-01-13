package com.example.springboot.hellospringboot.service;

import com.example.springboot.hellospringboot.dao.mybatis.CustomerDao;
import com.example.springboot.hellospringboot.domain.pojo.mbg.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dominiczhu
 * @version 1.0
 * @title MemoryCacheService
 * @date 2021/10/11 下午5:19
 */
@Service
@CacheConfig(cacheNames = "memoryCache") // spring 内存注解
public class MemoryCacheService {

    @Autowired
    private CustomerDao customersDao;


    @Cacheable(cacheNames = "custormers") // spring 内存注解 在缓存就读缓存 不在缓存就读db然后插入缓存
    public List<Customer> findCustomers(){

        List<Customer> customers = customersDao.selectCustomersRowBounds(1, 1);
        return customers;

    }

    @CacheEvict(cacheNames = "custormers") // spring 内存注解 释放custormers缓存
    public void fireCustormers(){

    }

    @CachePut(cacheNames = "custormers_put") // spring 内存注解 cacheput是不管在不在，都读db然后设置缓存
    public List<Customer> findCustomersPut(){

        List<Customer> customers = customersDao.selectCustomersRowBounds(1, 1);
        return customers;

    }

    @CacheEvict(cacheNames = "custormers_put") // spring 内存注解 释放custormers_put缓存
    public void fireCustomersPut(){

    }

}
