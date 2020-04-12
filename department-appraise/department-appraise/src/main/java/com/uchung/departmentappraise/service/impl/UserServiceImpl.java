package com.uchung.departmentappraise.mapper;

import com.uchung.departmentappraise.model.Personnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    PersonnelMapper pmapper;
    @Override
    public int selectByPrimaryKey(Integer id) {
        return pmapper.selectByPrimaryKey(id);
    }
    @Override
    public List queryPage(Integer startRows) {
        return pmapper.queryPage(startRows);
    }
    @Override
    public int getRowCount() {
        return pmapper.getRowCount();
    }
    @Override
    public int insertPerson(Personnel personnel) {
        return pmapper.insertPerson(personnel);
    }
    @Override
    public int update(Personnel personnel) {
        return pmapper.update(personnel);
    }
    @Override
    public int delete(int id) {
        return pmapper.delete(id);
    }
}