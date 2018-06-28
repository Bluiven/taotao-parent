package com.taotao.manage.service;

import com.github.abel533.mapper.Mapper;
import com.taotao.manage.mapper.ItemCatMapper;
import com.taotao.manage.pojo.ItemCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 10:00
 */
@Service("itemCatService")
public class ItemCatService {

    @Autowired
    private ItemCatMapper itemCatMapper;

    public List<ItemCat> queryItemCatListByStatus(Long parentId){

        List<ItemCat> itemCatList = itemCatMapper.queryItemCatListByStatus(parentId);

        return itemCatList;
    }


}
