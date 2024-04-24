package com.example.demo.modules.user.mapper;

import java.util.List;
import com.example.demo.modules.user.models.User;

public interface UserMapper {

    List<User> selectAll();

    List<User> getById(Long id);
}
