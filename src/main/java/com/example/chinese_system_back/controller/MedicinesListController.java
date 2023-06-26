package com.example.chinese_system_back.controller;

import com.example.chinese_system_back.entity.MedicinesListEntity;
import com.example.chinese_system_back.mapper.MedicinesListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :Double-Hong
 * @name :ChiesesSystem_back
 * @date :2023/6/26
 * @time :21:51
 **/

@RestController
@RequestMapping("/medicines-list-entity")
public class MedicinesListController {

    @Autowired
    MedicinesListMapper medicinesListMapper;

    @GetMapping("/getAll")
    public List<MedicinesListEntity> getAll(){
        return medicinesListMapper.selectList(null);
    }
}
