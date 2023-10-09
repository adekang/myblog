package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Category对象", description = "分类")
public class Category implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "category_id", type = IdType.AUTO)
    private Long categoryId;

    private String categoryName;

    private String aliasName;

    private String description;

    private Long parentId;

    private Date createTime;
}
