package com.example.springboot.hellospringboot.service;

import com.example.springboot.hellospringboot.dao.mbg.OrderdetailsMapper;
import com.example.springboot.hellospringboot.dao.customized.OrderdetailsDao;
import com.example.springboot.hellospringboot.domain.pojo.Orderdetails;
import com.example.springboot.hellospringboot.domain.query.example.OrderdetailsExample;
import com.example.springboot.hellospringboot.domain.pojo.OrderdetailsKey;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
* @author codegen
* @date 2022/01/14
*/
@Service
public class OrderdetailsService{

    @Autowired
    private OrderdetailsDao orderdetailsDao;

    @Autowired
    private OrderdetailsMapper orderdetailsMapper;

    // 基于OrderdetailsMapper

    @Transactional(rollbackFor = Exception.class)
    public int create(Orderdetails record) {
        if (record == null) {
            return 0;
        }
        return orderdetailsMapper.insert(record);
    }

    @Transactional(rollbackFor = Exception.class)
    public int createBatch(Collection<Orderdetails> records) {
        if (records == null || records.isEmpty()) {
            return 0;
        }
        return orderdetailsMapper.insertBatch(records);
    }

    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(OrderdetailsKey key) {
        if (key == null) {
            return 0;
        }
        return orderdetailsMapper.deleteByPrimaryKey(key);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(Orderdetails record) {
        if (record == null) {
            return 0;
        }
        return orderdetailsMapper.updateByPrimaryKey(record);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByExampleSelective(Orderdetails record, OrderdetailsExample example) {
        if (record == null || example == null) {
            return 0;
        }
        return orderdetailsMapper.updateByExampleSelective(record, example);
    }

    @Transactional(rollbackFor = Exception.class)
    public int updateByExample(Orderdetails record, OrderdetailsExample example) {
        if (record == null || example == null) {
            return 0;
        }
        return orderdetailsMapper.updateByExample(record, example);
    }


    public long countByExample(OrderdetailsExample example) {
        if (example == null) {
            return 0L;
        }

        return orderdetailsMapper.countByExample(example);
    }

    public List<Orderdetails> selectByExample(OrderdetailsExample example) {
        if (example == null) {
            return new ArrayList<>();
        }
        return orderdetailsMapper.selectByExample(example);
    }

    public Orderdetails selectByPrimaryKey(OrderdetailsKey key) {
        if (key == null) {
            return null;
        }
        return orderdetailsMapper.selectByPrimaryKey(key);
    }

    // 基于orderdetailsDao

}
