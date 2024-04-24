package com.example.common.module.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.module.user.mapper.UserMapper;
import com.example.common.module.user.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
