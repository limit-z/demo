package com.rainxing.app.mapper;

import com.rainxing.app.pojo.Customorchecktype;

public interface CustomorchecktypeMapper {
    int deleteByPrimaryKey(String autoID);

    int insert(Customorchecktype record);

    int insertSelective(Customorchecktype record);

    Customorchecktype selectByPrimaryKey(String autoID);

    int updateByPrimaryKeySelective(Customorchecktype record);

    int updateByPrimaryKey(Customorchecktype record);
}