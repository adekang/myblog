package com.blog.backend.entity.DO;

import com.blog.backend.entity.Tag;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class ArticleDO {
    private String title;
    private String content;
    private List<Tag> tags = new ArrayList<>();
}
