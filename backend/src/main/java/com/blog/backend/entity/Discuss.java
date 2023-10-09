package com.blog.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "Discuss对象", description = "评论")
public class Discuss implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "discuss_id", type = IdType.AUTO)
    private Long discussId;

    private Date createTime;

    private Integer likeCount;

    private Long discussUserId;

    private Long articleId;

    private String content;

    private Long parentId;
}
