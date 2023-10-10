package com.blog.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.backend.entity.Article;
import com.blog.backend.entity.VO.ArticlePost;
import com.blog.backend.mapper.ArticleMapper;
import com.blog.backend.service.IArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<ArticlePost> findAllPost() {

        List<ArticlePost> allPosts = articleMapper.findAllPost();
        for (ArticlePost allPost : allPosts) {
            log.info("articlePost: {}", allPost);
            List<String> tags = List.of(allPost.getTagString().split(","));
            allPost.setTags(tags);
        }
        return allPosts;
    }
}
