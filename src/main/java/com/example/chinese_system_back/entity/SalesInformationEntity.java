package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * @author Double-Hong and My-way 
 * @since 2023-06-24 19:16:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("sales_information")
@ApiModel(value = "SalesInformationEntity对象", description = "")
public class SalesInformationEntity {

    @TableId(value = "sales_id", type = IdType.AUTO)
    private String salesId;

    @TableField("medicine_id")
    private String medicineId;

    @TableField("customer_id")
    private String customerId;

    @TableField("sales_date")
    private LocalDate salesDate;

    @TableField("quantity")
    private double quantity;

    @TableField("TotalPrice")
    private double totalPrice;

    @TableField("unit")
    private String unit;


}
