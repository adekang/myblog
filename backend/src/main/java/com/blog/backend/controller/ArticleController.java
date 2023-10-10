package com.blog.backend.controller;

import com.blog.backend.common.Result;
import com.blog.backend.entity.VO.ArticlePost;
import com.blog.backend.service.IArticleService;
import com.blog.backend.service.IUsersService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@ApiOperation("文章管理")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private IArticleService articleService;

    @GetMapping("/findAllPost")
    public Result findAll() {
        List<ArticlePost> allPost = articleService.findAllPost();
        return Result.success(allPost);
    }
}
