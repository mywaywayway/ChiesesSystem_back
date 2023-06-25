package com.example.chinese_system_back;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.chinese_system_back.mapper")
public class ChiesesSystemBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChiesesSystemBackApplication.class, args);
    }

}
