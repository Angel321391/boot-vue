package com.uchung.departmentappraise.mapper;

import com.uchung.departmentappraise.model.Other;

public interface OtherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Other record);

    int insertSelective(Other record);

    Other selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Other record);

    int updateByPrimaryKey(Other record);
}