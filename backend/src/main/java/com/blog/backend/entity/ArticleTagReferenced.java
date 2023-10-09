package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@ApiModel(value = "ArticleTagReferenced对象", description = "文章标签关联")
public class ArticleTagReferenced implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @TableId(value = "atr_Id", type = IdType.AUTO)
    private Long atrId;

    private Long articleId;

    private Long tagId;
}
