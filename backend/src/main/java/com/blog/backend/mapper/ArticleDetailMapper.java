package com.blog.backend.mapper;

import com.blog.backend.entity.ArticleDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 文章详情  Mapper 接口
 * </p>
 *
 * @author adekang
 * @since 2023-10-25
 */
public interface ArticleDetailMapper extends BaseMapper<ArticleDetail> {
    void insertDetail(ArticleDetail articleDetail);
}
