package com.uchung.departmentappraise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class DepartmentAppraiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentAppraiseApplication.class, args);
    }

}
