package com.example.common.module.admin.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.module.admin.mapper.AdminMapper;
import com.example.common.module.admin.model.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
