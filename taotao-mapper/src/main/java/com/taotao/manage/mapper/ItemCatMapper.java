package com.taotao.manage.mapper;

import com.taotao.manage.pojo.ItemCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Bluiven
 * @date 2018-06-27 10:04
 */

public interface ItemCatMapper {

    /**
     * 查询所有商品类目
     * @return
     */
    List<ItemCat> queryItemCatListByStatus(@Param("parentId") Long parentId);

}
