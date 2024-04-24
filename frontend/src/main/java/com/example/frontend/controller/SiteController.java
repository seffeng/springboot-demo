package com.example.frontend.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.constant.StatusConst;
import com.example.common.module.user.model.User;
import com.example.common.module.user.service.UserService;
import io.github.seffeng.basics.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("site")
public class SiteController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.application.env}")
    private String environment;

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String index() {
        return "Hello " + applicationName + "-" + environment;
    }

    @GetMapping("test")
    public String test(@RequestParam(name = "name", defaultValue = "") String name) {
        if (Objects.equals(name, StatusConst.NORMAL.getId().toString())) {
            return "Hello " + name + " 与常量匹配！";
        }
        return "Hello " + name + '！';
    }

    @GetMapping("view/{id}")
    public Response view(@PathVariable(value = "id") Long id) {
        User user = userService.getById(id);
        if (user == null) {
            return Response.error("用户不存在！");
        }
        return Response.success(user);
    }

    @GetMapping("list")
    public Response list(@RequestParam(name = "page", defaultValue = "1") Integer page, @RequestParam(name = "perPage", defaultValue = "10") Integer perPage) {
        Page<User> users = userService.page(new Page<>(page, perPage));
        long totalCount = users.getTotal();
        System.out.println("有 " + totalCount + " 条数据！");

        Map<String, Object> data = new HashMap<>();
        data.put("items", users.getRecords());

        Map<String, Long> pagination = new HashMap<>();
        pagination.put("currentPage", users.getCurrent());
        pagination.put("pageCount", users.getPages());
        pagination.put("perPage", users.getSize());
        pagination.put("totalCount", users.getTotal());
        data.put("page", pagination);
        return Response.success(data);
    }
}
