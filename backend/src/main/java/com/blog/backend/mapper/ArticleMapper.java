package com.blog.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blog.backend.entity.Article;
import com.blog.backend.entity.VO.ArticlePost;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    List<ArticlePost> findAllPost();

    int insert(Article article);
}
