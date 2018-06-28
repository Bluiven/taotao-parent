package com.taotao.manage.controller;

import com.taotao.manage.pojo.ItemCat;
import com.taotao.manage.service.ItemCatService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 9:56
 */
@Controller
@RequestMapping("item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @GetMapping
    public ResponseEntity<List<ItemCat>> queryItemCatList(@RequestParam(value = "id",defaultValue = "0")Long parentId) {

        try {
            List<ItemCat> itemCatsList = itemCatService.queryItemCatListByStatus(parentId);

            //如果itemCatsList为null,则响应页面notFound状态码
            if (CollectionUtils.isEmpty(itemCatsList)) {
                //return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
                return ResponseEntity.notFound().build();
            }
                return ResponseEntity.ok(itemCatsList);
        } catch (Exception e) {
                e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

    }
}
