package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.SalesViewEntity;
import com.example.chinese_system_back.mapper.SalesViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales-view")
public class SalesViewController {

    @Autowired
    SalesViewMapper salesViewMapper;

    @ResponseBody
    @GetMapping("/get-sales-view/{customerId}")
    public List<SalesViewEntity> getSalesView(@PathVariable String customerId) {
        return salesViewMapper.selectList(Wrappers.<SalesViewEntity>lambdaQuery().eq(SalesViewEntity::getCustomerId, customerId));
    }
}
