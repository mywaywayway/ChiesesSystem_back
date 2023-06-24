package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Double-Hong and My-way and 何栋梁 and 肖雅云
 * @since 2023-06-24 16:21:27
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("medicines")
@ApiModel(value = "MedicinesEntity对象", description = "")
public class MedicinesEntity {

    @TableId(value = "medicine_id", type = IdType.AUTO)
    private String medicineId;

    @TableField("medicine_name")
    private String medicineName;

    @TableField("supplier_id")
    private String supplierId;

    @TableField("unit_price")
    private BigDecimal unitPrice;

    @TableField("stock_quantity")
    private BigDecimal stockQuantity;

    @TableField("stock_unit")
    private String stockUnit;


}
