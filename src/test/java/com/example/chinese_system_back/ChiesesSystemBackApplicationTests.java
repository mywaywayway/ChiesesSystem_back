package com.example.chinese_system_back;

import com.example.chinese_system_back.mapper.MedicinesListMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChiesesSystemBackApplicationTests {

    @Autowired
    MedicinesListMapper medicinesListMapper;

    @Test
    void contextLoads() {
        System.out.println(medicinesListMapper.selectList(null));
    }

}
