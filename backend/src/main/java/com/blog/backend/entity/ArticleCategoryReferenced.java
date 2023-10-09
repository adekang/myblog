package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@ApiModel(value = "ArticleCategoryReferenced对象", description = "文章分类关联")
public class ArticleCategoryReferenced implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "acr_Id", type = IdType.AUTO)
    private Long acrId;

    private Long articleId;

    private Long categoryId;
}
