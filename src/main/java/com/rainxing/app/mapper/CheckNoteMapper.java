package com.rainxing.app.mapper;

import com.rainxing.app.pojo.CheckNote;

public interface CheckNoteMapper {
    int deleteByPrimaryKey(String autoID);

    int insert(CheckNote record);

    int insertSelective(CheckNote record);

    CheckNote selectByPrimaryKey(String autoID);

    int updateByPrimaryKeySelective(CheckNote record);

    int updateByPrimaryKeyWithBLOBs(CheckNote record);

    int updateByPrimaryKey(CheckNote record);
}