package com.example.common.module.user.service;

import com.example.common.module.user.mapper.UserMapper;
import com.example.common.module.user.model.User;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
