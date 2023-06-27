package com.example.chinese_system_back.controller;


import com.example.chinese_system_back.entity.OrderInformationEntity;
import com.example.chinese_system_back.mapper.OrderInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author  My-way
 * @since 2023-06-27 13:37:52
 */
@RestController
@RequestMapping("/order-information-entity")
public class OrderInformationController {

    @Autowired
    OrderInformationMapper orderInformationMapper;

    @ResponseBody
    @PostMapping("/updateByOrderId")
    public int updateByOrderId(@RequestBody OrderInformationEntity orderInformationEntity){
        return orderInformationMapper.updateById(orderInformationEntity);
    }

    @ResponseBody
    @PostMapping("/insertOrder")
    public int insertOrder(@RequestBody OrderInformationEntity orderInformationEntity){
        UUID uuid= UUID.randomUUID();
        orderInformationEntity.setOrderId(uuid.toString());
        return orderInformationMapper.insert(orderInformationEntity);
    }

    @ResponseBody
    @GetMapping("/deleteByOrderId/{orderId}")
    public int deleteByOrderId(@PathVariable String orderId){
        return orderInformationMapper.deleteById(orderId);
    }
}

