package com.example.springboot.hellospringboot.service;

import com.example.springboot.hellospringboot.dao.mybatis.ItemDao;
import com.example.springboot.hellospringboot.domain.pojo.mbg.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dominiczhu
 * @version 1.0
 * @title DataAccessTestService
 * @date 2021/9/15 下午3:45
 */
@Service
public class DataAccessTestService {

    @Autowired
    private ItemDao itemsDao;

    public List<Item> selectItems() {
        return itemsDao.selectItems();
    }

}
