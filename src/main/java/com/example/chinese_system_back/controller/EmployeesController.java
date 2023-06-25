package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.EmployeesEntity;
import com.example.chinese_system_back.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Double-Hong and My-way 
 * @since 2023-06-24 19:16:12
 */
@RestController
@RequestMapping("/employees-entity")
public class EmployeesController {

     @Autowired
     EmployeesMapper employeesMapper;

     @ResponseBody
     @PostMapping("/login")
        public List<EmployeesEntity> login(@RequestBody EmployeesEntity employeesEntity){
            return employeesMapper.selectList(Wrappers.<EmployeesEntity>lambdaQuery().eq(EmployeesEntity::getUserName,employeesEntity.getUserName()).eq(EmployeesEntity::getPassword,employeesEntity.getPassword()));
        }
}

