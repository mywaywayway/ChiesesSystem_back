package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.CustomersEntity;
import com.example.chinese_system_back.mapper.CustomersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Double-Hong and My-way 
 * @since 2023-06-24 19:16:12
 */
@RestController
@RequestMapping("/customers-entity")
public class CustomersController {
       @Autowired
    CustomersMapper customersMapper;


       @ResponseBody
    @PostMapping("/login")
    public List<CustomersEntity> login(@RequestBody CustomersEntity customersEntity){

        return customersMapper.selectList(Wrappers.<CustomersEntity>lambdaQuery().eq(CustomersEntity::getUserName,customersEntity.getUserName()).eq(CustomersEntity::getPassword,customersEntity.getPassword()));
    }

    @ResponseBody
    @PostMapping("/register")
    public int register(@RequestBody CustomersEntity customersEntity){
       UUID uuid = UUID.randomUUID();
        customersEntity.setCustomerId(uuid.toString());
        return customersMapper.insert(customersEntity);
    }
    @ResponseBody
    @GetMapping("/getInfoById/{id}")
    public CustomersEntity getInfoById(@PathVariable String id){
        return customersMapper.selectById(id);
    }
    @ResponseBody
    @PostMapping("/updateInfo")
    public int updateInfo(@RequestBody CustomersEntity customersEntity){
        return customersMapper.updateById(customersEntity);
    }

}

