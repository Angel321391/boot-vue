package com.uchung.departmentappraise.controller;
import com.uchung.departmentappraise.model.Salary;
import org.springframework.web.bind.annotation.*;
import com.uchung.departmentappraise.service.UserService;
import com.uchung.departmentappraise.service.SalaryService;
import java.util.List;
/**
 *控制器
 */
@RestController
public class LoginController {
    @Autowired
    UserService uservice;
    @Autowired
    SalaryService sservice;
    @RequestMapping(value="/query",method=RequestMethod.POST)
    public Integer query(Integer id){
        int result =uservice.selectByPrimaryKey(id);
        return result;
    }

    /**
     * 分页
     * @return
     */
    @RequestMapping(value="/page")
    @ResponseBody
    public List<User> page(Integer page){
        int pageNow = page == null ? 1 : page;
        int pageSize = 5;
        int startRows = pageSize*(pageNow-1);
        List<User> list = uservice.queryPage(startRows);
        return list;
    }

    /**
     * rows
     * @return
     */
    @RequestMapping(value="/rows")
    @ResponseBody
    public int rows(){
        return userService.getRowCount();
    }
    @RequestMapping(value="/insert",method=RequestMethod.POST)
    public Integer insert(Personnel personnel){
        int result =uservice.insertPerson(personnel);
        return result;
    }
    @RequestMapping(value="/update",method=RequestMethod.POST)
    public Integer update(Personnel personnel){
        int result =uservice.update(personnel);
        return result;
    }
    @RequestMapping(value="/delete",method=RequestMethod.POST)
    public Integer delete(Integer id){
        int result =uservice.delete(id);
        return result;
    }

    @RequestMapping(value="/insertSalary",method=RequestMethod.POST)
    public Integer insertSalary(Salary record){
        int result =sservice.insert(record);
        return result;
    }
}
