package com.blog.backend.service.impl;

import com.blog.backend.entity.ArticleDetail;
import com.blog.backend.mapper.ArticleDetailMapper;
import com.blog.backend.service.IArticleDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章详情  服务实现类
 * </p>
 *
 * @author adekang
 * @since 2023-10-25
 */
@Service
public class ArticleDetailServiceImpl extends ServiceImpl<ArticleDetailMapper, ArticleDetail> implements IArticleDetailService {

}
