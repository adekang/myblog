package com.blog.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blog.backend.entity.Article;
import com.blog.backend.entity.ArticleDetail;
import com.blog.backend.entity.DO.ArticleDO;
import com.blog.backend.entity.Tag;
import com.blog.backend.entity.VO.ArticlePost;
import com.blog.backend.mapper.ArticleDetailMapper;
import com.blog.backend.mapper.ArticleMapper;
import com.blog.backend.mapper.TagMapper;
import com.blog.backend.service.IArticleService;
import com.blog.backend.service.ITagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private ArticleDetailMapper articleDetailMapper;
    @Resource
    private ITagService tagService;

    @Transactional // 事务 保证数据一致性
    @Override
    public List<ArticlePost> findAllPost() {

        List<ArticlePost> allPosts = articleMapper.findAllPost();
        for (ArticlePost allPost : allPosts) {
            if (allPost.getTagIds() == null || allPost.getTagIds().isEmpty()) {
                continue;
            }
            ArrayList<Tag> tags = new ArrayList<>();
            for (String s : allPost.getTagIds().split(",")) {
                Tag tag = tagService.getById(s);
                tags.add(tag);
            }
            allPost.setTags(tags);

        }
        return allPosts;
    }

    @Transactional // 事务 保证数据一致性
    @Override
    public void insert(ArticleDO articleDO) {
        log.info("新增文章：{}", articleDO);
        Article article = new Article();
        article.setTitle(articleDO.getTitle());
        articleMapper.insert(article);
        // 文章内容新增
        Long articleId = article.getArticleId();
        ArticleDetail articleDetail = ArticleDetail.builder()
                .articleId(articleId)
                .contentMd(articleDO.getContent())
                .build();
        articleDetailMapper.insertDetail(articleDetail);

        // 文章标签新增


    }
}
