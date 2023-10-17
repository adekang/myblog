package com.blog.backend.controller;

import com.blog.backend.common.Result;
import com.blog.backend.entity.Tag;
import com.blog.backend.entity.VO.TagAll;
import com.blog.backend.service.ITagService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 标签  前端控制器
 * </p>
 *
 * @author adekang
 * @since 2023-10-16
 */
@ApiOperation("标签管理")
@RestController
@RequestMapping("/tag")
public class TagController {

    @Resource
    private ITagService tagService;

    @ApiOperation("查询所有标签")
    @RequestMapping("/findAll")
    public Result findAll() {
        List<Tag> tags = tagService.findAll();
        List<TagAll> tagAlls = new ArrayList<>();
        for(Tag tag : tags){
            TagAll tagAll = new TagAll();
            BeanUtils.copyProperties(tag, tagAll);
            tagAlls.add(tagAll);
        }
        return Result.success(tagAlls);
    }

}
