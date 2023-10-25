package com.blog.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blog.backend.entity.Article;
import com.blog.backend.entity.DO.ArticleDO;
import com.blog.backend.entity.VO.ArticlePost;

import java.util.List;

public interface IArticleService extends IService<Article> {
    List<ArticlePost> findAllPost();

    void insert(ArticleDO articleDO);
}
