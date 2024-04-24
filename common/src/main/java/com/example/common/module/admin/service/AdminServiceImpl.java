package com.example.common.module.admin.service;

import com.example.common.module.admin.mapper.AdminMapper;
import com.example.common.module.admin.model.Admin;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
