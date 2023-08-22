package com.blog.backend.controller;

import com.blog.backend.common.Result;
import com.blog.backend.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author adekang
 * @since 2023-08-10
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Resource
    private IUsersService userService;


    @GetMapping("/findAll")
    public Result findAll() {
        return Result.success(userService.list());
    }


}
