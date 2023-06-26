package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.EmployeesEntity;
import com.example.chinese_system_back.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
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
    public List<EmployeesEntity> login(@RequestBody EmployeesEntity employeesEntity) {
        return employeesMapper.selectList(new QueryWrapper<EmployeesEntity>().eq("user_name", employeesEntity.getUserName()).eq("password", employeesEntity.getPassword()));
    }


    /**
     * 获取当前员工信息
     * @param id 当前员工id
     * @return 当前员工信息
     */
    @GetMapping("/getEmployeeById/{id}")
    public EmployeesEntity getEmployeeById(@PathVariable("id") String id){
        return employeesMapper.selectById(id);
    }

    /**
     * 更新员工信息
     * @param employeesEntity 新的员工信息
     * @return 更新结果, 成功返回新的员工信息, 失败返回null
     */

    @PostMapping("/updateEmployee")
    public EmployeesEntity updateEmployee(@RequestBody EmployeesEntity employeesEntity){
        if (employeesMapper.updateById(employeesEntity)==1){
            return employeesEntity;
        }else {
            return null;
        }
    }


}

