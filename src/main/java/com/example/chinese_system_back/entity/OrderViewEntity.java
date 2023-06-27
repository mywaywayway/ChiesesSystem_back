package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author  My-way
 * @since 2023-06-26 22:30:08
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_view")
@ApiModel(value = "OrderEntity对象", description = "")
public class OrderViewEntity {

    @TableField("order_id")
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

    @TableField("status")
    private String status;

  @TableField("medicine_name")
    private String medicineName;

}
