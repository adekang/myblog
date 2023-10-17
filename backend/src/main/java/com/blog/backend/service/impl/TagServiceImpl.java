package com.blog.backend.service.impl;

import com.blog.backend.entity.Tag;
import com.blog.backend.mapper.TagMapper;
import com.blog.backend.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 标签  服务实现类
 * </p>
 *
 * @author adekang
 * @since 2023-10-16
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

    @Resource
    private TagMapper tagMapper;
    @Override
    public List<Tag> findAll() {
        return tagMapper.findAll();
    }
}
