package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.SuppliersEntity;
import com.example.chinese_system_back.mapper.SuppliersMapper;
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
@RequestMapping("/suppliers-entity")
public class SuppliersController {


    @Autowired
    SuppliersMapper suppliersMapper;

    @ResponseBody
    @PostMapping("/login")
    public List<SuppliersEntity> login(@RequestBody SuppliersEntity suppliersEntity){

        return suppliersMapper.selectList(Wrappers.<SuppliersEntity>lambdaQuery().eq(SuppliersEntity::getUserName,suppliersEntity.getUserName()).eq(SuppliersEntity::getPassword,suppliersEntity.getPassword()));
    }

    /**
     * 获取所有供应商
     * @return 供应商列表
     */

    @GetMapping("/getSuppliers")
    public List<SuppliersEntity> getSuppliers(){
        return suppliersMapper.selectList(null);
    }
}

