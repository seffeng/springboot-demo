package com.example.console.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import com.example.common.config.ApplicationProperties;

@ShellComponent
@EnableConfigurationProperties(ApplicationProperties.class)
public class TestOne {

    @Autowired
    private ApplicationProperties appConfig;

    @ShellMethod(value = "描述第一个命令", key = "bye")
    public void goodbye(@ShellOption(value = { "--name", "-n" }, defaultValue = "") String name) {

        System.out.println("Env: " + appConfig.getEnv() + ", name: " + appConfig.getName() + ", debug: " + appConfig.getDebug()
            // + ", profile: " + appConfig.getProfiles().get(2) + ", propertie: " + appConfig.getProperties().get("name")
            // + ", myapp: " + appConfig.getMyapp().getName()
        );
        if (appConfig.getDebug()) {
            System.out.println("debug--true--aaaaaaaaaaaaaaa");
        } else {
            System.out.println("debug--false--bbbbbbbbbbbbbbbb");
        }
        System.out.println("----------test--11111----------");
        System.out.println("----------goodbye " + name + "----------");
    }

    @ShellMethod(value = "描述第二个命令")
    public void byebye(@ShellOption(value = { "--name", "-n" }, defaultValue = "") String name) {

        System.out.println("----------test--22222----------");
        System.out.println("----------byebye " + name + "----------");
    }

}
