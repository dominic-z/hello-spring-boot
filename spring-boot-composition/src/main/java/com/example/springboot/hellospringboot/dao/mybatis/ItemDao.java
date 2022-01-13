package com.example.springboot.hellospringboot.dao.mybatis;

import com.example.springboot.hellospringboot.domain.pojo.mbg.Item;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dominiczhu
 * @version 1.0
 * @title ItemDao
 * @date 2021/9/15 下午3:32
 */

@Repository
public class ItemDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private static final String NAMESPACE = "mybatis.mapper.items";

    public List<Item> selectItems() {
        return sqlSessionTemplate.selectList(NAMESPACE + ".select_items");
    }
}
