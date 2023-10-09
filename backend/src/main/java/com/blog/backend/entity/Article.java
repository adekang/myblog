package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Article对象", description = "文章")
public class Article implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "article_id", type = IdType.AUTO)
    private Long articleId;

    private Date pushData;

    private String articleUser;

    private String title;

    private Integer likeCount;

    private Integer commentCount;

    private Integer readCount;

    private String topFlag;

    private Date createTime;

    private String articleSummary;
}
