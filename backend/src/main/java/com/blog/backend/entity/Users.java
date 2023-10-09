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
import java.util.Date;

/**
 * @author adekang
 * @since 2023-08-10
 */
@Data
@ApiModel(value = "Users对象", description = "用户 ")
public class Users implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "user_Id", type = IdType.AUTO)
    private Long userId;

    private String userName;

    private String userNickname;

    private String pwd;

    private String email;

    private String avatar;

    private Date createTime;

    private Date birthday;

    private Integer age;

    private String mobilePhone;


}
