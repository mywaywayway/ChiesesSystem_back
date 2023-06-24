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
 * @author Double-Hong and My-way and 何栋梁 and 肖雅云
 * @since 2023-06-24 16:21:27
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("salesinformation")
@ApiModel(value = "SalesinformationEntity对象", description = "")
public class SalesinformationEntity {

    @TableId(value = "sales_id", type = IdType.AUTO)
    private String salesId;

    @TableField("medicine_id")
    private String medicineId;

    @TableField("customer_id")
    private String customerId;

    @TableField("sales_date")
    private LocalDate salesDate;

    @TableField("quantity")
    private BigDecimal quantity;

    @TableField("TotalPrice")
    private BigDecimal totalPrice;

    @TableField("unit")
    private String unit;


}