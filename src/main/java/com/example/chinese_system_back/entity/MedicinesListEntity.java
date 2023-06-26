package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author :Double-Hong
 * @name :ChiesesSystem_back
 * @date :2023/6/26
 * @time :21:18
 **/
@Data
@TableName("medicines_list")
@Getter
@Setter
public class MedicinesListEntity {
    @TableId(value = "medicine_id", type = IdType.AUTO)
    private String medicineId;

    @TableField("medicine_name")
    private String medicineName;

    @TableField("supplier_id")
    private String supplierId;

    @TableField("unit_price")
    private double unitPrice;

    @TableField("stock_quantity")
    private double stockQuantity;

    @TableField("stock_unit")
    private String stockUnit;

    @TableField("photo_url")
    private String photoUrl;

    @TableField("introduction")
    private String introduction;

    @TableField("supplier_name")
    private String supplierName;
}
