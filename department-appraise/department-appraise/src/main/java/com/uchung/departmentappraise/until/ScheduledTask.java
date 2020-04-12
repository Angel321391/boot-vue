package com.uchung.departmentappraise.until;

import com.uchung.departmentappraise.model.Salary;
import com.uchung.departmentappraise.service.UserService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 定时任务类
 *
 * @Component
 * 将类注入到Spring容器中, 相当于注入
 * @Configuration
 * 用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，并用于构建bean定义，初始化Spring容器
 * @EnableScheduling
 * 计时器注入, 使@Schedule注解可用
 * @CommonsLog
 * 打印日志, 不重要
 */
@Component
@Configuration
@EnableScheduling
@CommonsLog
public class ScheduledTask {

        private UserService uService;
        @Scheduled(cron="0 0 0 10 * ? ")//cron使用表达是进行任务的执行
        public void taskEndFissionWanted(){
            //每月10号触发
            FissionWantedQuery query=new FissionWantedQuery();
            List stateList=new ArrayList();
            stateList.add("1");
            query.setStateList(stateList);
            //获取所有状态为进行中的悬赏任务
            int data=uService.insert(record);

            if(Util.isNotEmpty(data)){
                SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                //遍历所有任务,结束时间已过的则结束任务
                for(Salary salary:data){
                    try {
                        Date endDate=format.parse(Salary.getEndTime());
                        if(endDate.before(new Date())){
                            //如果结束时间已过,则判断当前悬赏任务是否有回答
                            if(Salary.getAnswerCount()==0){
                                //无回答则设置状态为已结束
                                Salary.setState("4");
                                uService.updateByPrimaryKeySelective(record);
                            }else{
                                //有回答则设置状态为待结题状态
                                Salary.setState("3");
                                uService.updateByPrimaryKeySelective(record);
                            }
                        }else{
                            continue;
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }



        }
    }
