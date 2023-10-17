package com.blog.backend.service;

import com.blog.backend.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 标签  服务类
 * </p>
 *
 * @author adekang
 * @since 2023-10-16
 */
public interface ITagService extends IService<Tag> {

    List<Tag> findAll();
}
