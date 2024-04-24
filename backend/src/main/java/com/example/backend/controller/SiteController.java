package com.example.backend.controller;

import com.example.common.constant.StatusConst;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("site")
public class SiteController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.application.env}")
    private String environment;

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
    public String view(@PathVariable(value = "id") Long id) {
        if (id == StatusConst.NORMAL.getId().longValue()) {
            return "Hello " + id + " 与常量匹配！";
        }
        return "Hello " + id + '！';
    }
}
