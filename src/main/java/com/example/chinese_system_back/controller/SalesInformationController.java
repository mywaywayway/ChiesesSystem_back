package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.MedicinesEntity;
import com.example.chinese_system_back.entity.SalesInformationEntity;
import com.example.chinese_system_back.mapper.MedicinesMapper;
import com.example.chinese_system_back.mapper.SalesInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/sales-information-entity")
public class SalesInformationController {
       @Autowired
    SalesInformationMapper salesInformationMapper;
       @Autowired
    MedicinesMapper medicinesMapper;
       @ResponseBody
      @PostMapping("inster")
    public int insert(@RequestBody SalesInformationEntity salesInformationEntity){
           UUID uuid = UUID.randomUUID();
           salesInformationEntity.setSalesId(uuid.toString());
           MedicinesEntity medicinesEntity= medicinesMapper.selectOne(Wrappers.<MedicinesEntity>lambdaQuery().eq(MedicinesEntity::getMedicineId,salesInformationEntity.getMedicineId()));

           medicinesEntity.setStockQuantity(medicinesEntity.getStockQuantity()-salesInformationEntity.getQuantity());
           medicinesMapper.updateById(medicinesEntity);
           return salesInformationMapper.insert(salesInformationEntity);
       }
}

