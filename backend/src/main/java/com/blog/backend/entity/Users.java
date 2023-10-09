package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author adekang
 * @since 2023-08-10
 */
@Data
@ApiModel(value = "Users对象", description = "用户 ")
public class Users implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID")
    @TableId(value = "user_Id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("用户昵称")
    private String userNickname;

    @ApiModelProperty("用户密码")
    private String pwd;

    @ApiModelProperty("用户邮箱")
    private String email;

    @ApiModelProperty("用户头像")
    private String avatar;

    @ApiModelProperty("注册时间")
    private LocalDateTime createTime;

    @ApiModelProperty("用户生日")
    private LocalDate birthday;

    @ApiModelProperty("用户年龄")
    private Integer age;

    @ApiModelProperty("用户手机号")
    private String moblePhone;


}
