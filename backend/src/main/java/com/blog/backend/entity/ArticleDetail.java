package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ArticleDetail对象", description = "文章详情")
public class ArticleDetail implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "article_detail_id", type = IdType.AUTO)
    private Long articleDetailId;

    private String contentMd;

    private String contentHtml;

    private Long articleId;
}
