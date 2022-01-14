package com.example.springboot.hellospringboot.dao.customized;

import com.example.springboot.hellospringboot.domain.pojo.Customers;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* DAO for customized sql defined in  customized/mapper.xml
* for example
* public List<Customers> findByIds(Collection<Long> ids) {
*       if (ids.isEmpty()) {
*       return new ArrayList<>();
*       }
*       Map<String, Object> params = new HashMap<>();
*       params.put("ids", ids);
*       return sqlSessionTemplate.selectList(TABLE + ".select_by_ids", params);
*  }
*
* @author codegen
* @date 2022/01/14
*/
@Component
public class CustomersDao {

    private static final String TABLE = "com.example.springboot.hellospringboot.dao.customized.CustomersDao";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

}
