package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
@Getter
@Setter
@Accessors(chain = true)
@TableName("sales_view")
@ApiModel(value = "SalesviewEntity对象", description = "")
public class SalesViewEntity {
    @TableField("medicine_id")
    private  String medicineId;

    @TableField("sales_id")
    private  String salesId;

    @TableField("customer_id")
    private  String customerId;

    @TableField("sales_date")
    private  LocalDate salesDate;

    @TableField("quantity")
    private  double quantity;

    @TableField("TotalPrice")
    private  double totalPrice;

    @TableField("unit")
    private  String unit;

    @TableField("medicine_name")
    private  String medicineName;

    @TableField("customer_name")
    private  String customerName;

}
