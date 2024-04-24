package com.example.demo.modules.user.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.modules.user.mapper.UserMapper;
import com.example.demo.modules.user.models.User;
import com.github.pagehelper.PageHelper;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

     public List<User> getList(int page, int perPage) {
        PageHelper.startPage(page, perPage);
         return mapper.selectAll();
    }

    public List<User> getById(Long id) {
        return mapper.getById(id);
    }
}
