package com.example.backend.controller;

import com.example.common.constant.StatusConst;
import com.example.common.module.admin.model.Admin;
import com.example.common.module.admin.service.AdminService;
import io.github.seffeng.basics.base.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("site")
public class SiteController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.application.env}")
    private String environment;

    @Autowired
    private AdminService adminService;

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
        Admin admin = adminService.getById(id);
        if (Objects.isNull(admin)) {
            return Response.error("用户不存在！");
        }
        return Response.success(admin);
    }

    @GetMapping("list")
    public List<Admin> list() {
        List<Admin> admins = adminService.list();
        System.out.println("-------" + admins.size());
        return admins;
    }
}
