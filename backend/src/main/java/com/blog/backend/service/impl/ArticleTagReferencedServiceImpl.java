package com.blog.backend.service.impl;

import com.blog.backend.entity.ArticleTagReferenced;
import com.blog.backend.mapper.ArticleTagReferencedMapper;
import com.blog.backend.service.IArticleTagReferencedService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章标签  服务实现类
 * </p>
 *
 * @author adekang
 * @since 2023-10-25
 */
@Service
public class ArticleTagReferencedServiceImpl extends ServiceImpl<ArticleTagReferencedMapper, ArticleTagReferenced> implements IArticleTagReferencedService {

}
