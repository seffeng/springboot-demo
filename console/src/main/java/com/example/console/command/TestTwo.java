package com.example.console.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class TestTwo {

    @ShellMethod(value = "描述第一个命令", key = {"echo", "say"})
    public String sayHello(@ShellOption(value = {"--name",  "-n"}, defaultValue = "") String name, @ShellOption(defaultValue = "") Integer age) {
        System.out.println("----------test--22222----------");
        return "hello world! name: " + name + ", age: " + age;
    }

}
