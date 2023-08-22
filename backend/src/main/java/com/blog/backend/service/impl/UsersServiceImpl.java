package com.blog.backend.service.impl;

import com.blog.backend.entity.Users;
import com.blog.backend.mapper.UsersMapper;
import com.blog.backend.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author adekang
 * @since 2023-08-10
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
