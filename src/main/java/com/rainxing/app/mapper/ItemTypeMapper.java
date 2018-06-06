package com.rainxing.app.mapper;

import com.rainxing.app.pojo.ItemType;

public interface ItemTypeMapper {
    int deleteByPrimaryKey(String autoID);

    int insert(ItemType record);

    int insertSelective(ItemType record);

    ItemType selectByPrimaryKey(String autoID);

    int updateByPrimaryKeySelective(ItemType record);

    int updateByPrimaryKey(ItemType record);
}