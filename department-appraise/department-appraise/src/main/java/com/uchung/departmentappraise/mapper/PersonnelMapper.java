package com.uchung.departmentappraise.mapper;


import java.util.List;

import com.uchung.departmentappraise.model.Personnel;
import com.uchung.departmentappraise.mapper;

public interface PersonnelMapper {
    int selectByPrimaryKey(Integer id);

    List<Personnel> queryPage(Integer startRows);

    int getRowCount();
    //新增
    int insertPerson(Personnel personnel);
    //编辑
    int update(Personnel personnel);
    // 删除
    int delete(int id);
}