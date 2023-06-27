package com.example.chinese_system_back.controller;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.chinese_system_back.entity.OrderViewEntity;
import com.example.chinese_system_back.mapper.OrderViewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author  My-way
 * @since 2023-06-26 22:30:08
 */
@RestController
@RequestMapping("/order-entity")
public class OrderViewController {

    @Autowired
    OrderViewMapper orderViewMapper;

    @ResponseBody
    @GetMapping("getOrderBySupplierId/{supplierId}")
    public List<OrderViewEntity> getOrderBySupplierId(@PathVariable String supplierId){
        return orderViewMapper.selectList(Wrappers.<OrderViewEntity>lambdaQuery().eq(OrderViewEntity::getSupplierId,supplierId));
    }

    @ResponseBody
    @GetMapping("deleteOrderById/{orderId}")
    public int deleteOrderById(@PathVariable String orderId){
        return orderViewMapper.delete(Wrappers.<OrderViewEntity>lambdaQuery().eq(OrderViewEntity::getOrderId,orderId));
    }

   @ResponseBody
    @PostMapping("addOrder")
    public int addOrder(@RequestBody OrderViewEntity orderViewEntity){
       UUID uuid= UUID.randomUUID();
         orderViewEntity.setOrderId(uuid.toString());
        return orderViewMapper.insert(orderViewEntity);
    }

    @ResponseBody
    @PostMapping("updateOrder")
    public int updateOrder(@RequestBody OrderViewEntity orderViewEntity){
        return orderViewMapper.update(orderViewEntity,Wrappers.<OrderViewEntity>lambdaQuery().eq(OrderViewEntity::getOrderId, orderViewEntity.getOrderId()));
    }

}

