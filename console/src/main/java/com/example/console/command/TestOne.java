package com.example.console.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import com.example.common.config.ApplicationProperties;
import com.example.common.config.TestProperties;

@ShellComponent
@EnableConfigurationProperties({ApplicationProperties.class, TestProperties.class})
public class TestOne {

    @Autowired
    private ApplicationProperties appConfig;

    @Autowired
    private TestProperties testConfig;

    @ShellMethod(value = "描述第一个命令", key = "bye")
    public void goodbye(@ShellOption(value = { "--name", "-n" }, defaultValue = "") String name) {

        System.out.println("Env: " + appConfig.getEnv() + ", name: " + appConfig.getName() + ", debug: " + appConfig.getDebug()
            + ", profile: " + appConfig.getProfiles().get(2) + ", propertie: " + appConfig.getProperties().get("name")
            + ", myapp: id=" + appConfig.getMyapp().getId() + ", name=" + appConfig.getMyapp().getName()
            + ", testConfig: [A: id=" + testConfig.getAppA().getId() + ", name=" + testConfig.getAppA().getName() + "], [B: id="
            + testConfig.getAppB().getId() + ", name=" + testConfig.getAppB().getName() + "]"
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
