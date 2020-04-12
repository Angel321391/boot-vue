package com.uchung.departmentappraise.mapper;

import com.uchung.departmentappraise.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SalaryServiceImpl implements SalaryService{
    @Autowired
    SalaryMapper smapper;
    @Override
    public int insert(Salary record) {
        return smapper.insert(record);
    }
    }
}