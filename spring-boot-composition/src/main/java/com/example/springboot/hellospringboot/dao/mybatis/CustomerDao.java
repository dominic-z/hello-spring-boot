package com.example.springboot.hellospringboot.dao.mybatis;

import com.example.springboot.hellospringboot.dao.mybatis.mbg.CustomerMapper;
import com.example.springboot.hellospringboot.domain.pojo.mbg.Customer;
import com.example.springboot.hellospringboot.domain.pojo.mbg.example.CustomerExample;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dominiczhu
 * @version 1.0
 * @title ItemDao
 * @date 2021/9/15 下午3:32
 */

@Repository
public class CustomerDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    private CustomerMapper customerMapper;

    private static final String NAMESPACE = "mybatis.mapper.customers";

    public List<Customer> selectCustomers() {
        return sqlSessionTemplate.selectList(NAMESPACE + ".select_customers");
    }

    public List<Customer> selectCustomerWithWhere(long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", Collections.singleton(id));

        return sqlSessionTemplate.selectList(NAMESPACE + ".select_with_where", params);
    }

    public List<Customer> selectCustomersRowBounds(int offset, int limit) {
//        mybatis-pageHelper笔记: 使用RowBounds，如果没有使用pagehelper，那么rowbounds是对所有结果检索出来之后再进行遍历分页
//        而使用pageHelper，会直接对sql进行修改，即新增limit，进行硬分页。可以通过打印sql来验证
        return sqlSessionTemplate.selectList(NAMESPACE + ".select_customers", null, new RowBounds(offset, limit));
    }

    public Customer selectByCustomerNumber(int customerNumber) {


        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCustomerNumberEqualTo(customerNumber);
        final List<Customer> customers = customerMapper.selectByExample(customerExample);
        if (customers.isEmpty()) {
            return null;
        } else {
            return customers.get(0);
        }

    }

}
