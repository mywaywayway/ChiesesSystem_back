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
 * @author  My-way
 * @since 2023-06-27 13:37:52
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_information")
@ApiModel(value = "OrderInformationEntity对象", description = "")
public class OrderInformationEntity {

    @TableId(value = "order_id", type = IdType.AUTO)
    private String orderId;

    @TableField("medicine_id")
    private String medicineId;

    @TableField("supplier_id")
    private String supplierId;

    @TableField("supply_date")
    private LocalDate supplyDate;

    @TableField("quantity")
    private BigDecimal quantity;

    @TableField("unit")
    private String unit;

    @TableField("`status`")
    private String status;


}
