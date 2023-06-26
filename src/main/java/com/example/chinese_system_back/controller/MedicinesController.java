package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.MedicinesEntity;
import com.example.chinese_system_back.mapper.MedicinesMapper;
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
@RequestMapping("/medicines-entity")
public class MedicinesController {
    @Autowired
    MedicinesMapper medicinesMapper;

    @ResponseBody
    @PostMapping("/getMedicines")
    public List<MedicinesEntity> getMedicines(){
        return medicinesMapper.selectList(null);
    }

    @ResponseBody
    @GetMapping("/getMedicinesByName/{name}/{index}")
        public List<MedicinesEntity> getMedicinesByName(@PathVariable String name,@PathVariable int index){
            return medicinesMapper.selectList(Wrappers.<MedicinesEntity>lambdaQuery().like(MedicinesEntity::getMedicineName,name));
        }

}

