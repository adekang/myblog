package com.blog.backend.entity.VO;

import com.blog.backend.entity.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ArticlePost implements Serializable {
    private Integer articleId;
    private String title;
    private Integer readCount;
    private Integer likeCount;
    private String articleSummary;
    private List<Tag> tags;

    @JsonIgnore
    private String tagIds;
}
