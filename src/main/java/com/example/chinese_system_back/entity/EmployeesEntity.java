package com.example.chinese_system_back.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("employees")
@ApiModel(value = "EmployeesEntity对象", description = "")
public class EmployeesEntity {

    @TableId(value = "employee_id", type = IdType.AUTO)
    private String employeeId;

    @TableField("employee_name")
    private String employeeName;

    @TableField("address")
    private String address;

    @TableField("contact_number")
    private String contactNumber;

    @TableField("power")
    private Integer power;


}
