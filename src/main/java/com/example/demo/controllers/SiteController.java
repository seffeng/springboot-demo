package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modules.user.models.User;
import com.example.demo.modules.user.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("site")
public class SiteController {

    @Autowired
    private UserService service;

    @GetMapping("")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public String test(@RequestParam(name = "name", defaultValue = "") String name) {
        return "Hello " + name + '！';
    }

    @GetMapping("list")
    public List<User> list(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int perPage) {
        return service.getList(page, perPage);
    }

    @GetMapping("view/{id}")
    public List<User> view(@PathVariable(value = "id") Long id) {
        return service.getById(id);
    }
}
