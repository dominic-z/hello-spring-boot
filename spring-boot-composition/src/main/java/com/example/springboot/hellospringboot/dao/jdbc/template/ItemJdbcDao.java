package com.example.springboot.hellospringboot.dao.jdbc.template;

import com.example.springboot.hellospringboot.domain.pojo.mbg.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author dominiczhu
 * @version 1.0
 * @title ItemDao
 * @date 2021/9/14 下午8:58
 */
@Repository
public class ItemJdbcDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Item> getItems(){

        List<Item> items=jdbcTemplate.query("select * from items", (resultSet, i) -> {
            int id=resultSet.getInt(1);
            String itemNo = resultSet.getString(2);
            Item item=new Item();
            item.setId(id);
            item.setItemNo(itemNo);
            return item;
        });

//        do the samething
//        items=jdbcTemplate.query("select * from items",new BeanPropertyRowMapper<>(Item.class));
        return items;
    }

}
