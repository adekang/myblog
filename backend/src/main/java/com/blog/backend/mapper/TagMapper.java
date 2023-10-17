package com.blog.backend.mapper;

import com.blog.backend.entity.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 标签  Mapper 接口
 * </p>
 *
 * @author adekang
 * @since 2023-10-16
 */
public interface TagMapper extends BaseMapper<Tag> {

    @Select("select * from tag")
    List<Tag> findAll();
}
