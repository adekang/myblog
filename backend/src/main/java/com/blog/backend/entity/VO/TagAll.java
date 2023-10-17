package com.blog.backend.entity.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@ApiModel(value = "TagVO对象", description = "标签返回")
public class TagAll implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "tag_Id", type = IdType.AUTO)
    private Long tagId;

    @ApiModelProperty("标签名")
    private String tagName;

    @ApiModelProperty("标签别名")
    private String aliasName;

    @ApiModelProperty("标签描述")
    private String description;

}



