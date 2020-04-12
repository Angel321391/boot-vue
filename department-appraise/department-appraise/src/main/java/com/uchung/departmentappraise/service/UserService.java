package com.uchung.departmentappraise.service;

import com.uchung.departmentappraise.model.Personnel;

import java.util.List;

public interface UserService {
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