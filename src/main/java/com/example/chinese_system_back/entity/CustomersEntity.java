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
 * @author Double-Hong and My-way 
 * @since 2023-06-24 19:16:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("customers")
@ApiModel(value = "CustomersEntity对象", description = "")
public class CustomersEntity {

    @TableId(value = "customer_id", type = IdType.AUTO)
    private String customerId;

    @TableField("customer_name")
    private String customerName;

    @TableField("address")
    private String address;

    @TableField("contact_number")
    private String contactNumber;

    @TableField("user_name")
    private  String userName;

    @TableField("password")
    private  String password;


}
