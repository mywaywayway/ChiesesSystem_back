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
@TableName("supplyinformation")
@ApiModel(value = "SupplyinformationEntity对象", description = "")
public class SupplyinformationEntity {

    @TableId(value = "supply_id", type = IdType.AUTO)
    private String supplyId;

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


}
