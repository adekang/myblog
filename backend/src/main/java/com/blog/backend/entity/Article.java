package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty("发布日期")
    private Date pushData;

    @ApiModelProperty("发表用户")
    private String articleUser;

    @ApiModelProperty("博文标题")
    private String title;

    @ApiModelProperty("点赞数")
    private Integer likeCount;

    @ApiModelProperty("评论数")
    private Integer commentCount;

    @ApiModelProperty("浏览量")
    private Integer readCount;

    @ApiModelProperty("是否置顶")
    private String topFlag;

    @ApiModelProperty("文章创建时间")
    private Date createTime;

    @ApiModelProperty("文章内容")
    private String articleSummary;
}
