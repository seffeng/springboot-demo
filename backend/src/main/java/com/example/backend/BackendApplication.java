package com.example.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.common.module.**.mapper"})
@ComponentScan(basePackages = {"com.example.common.**", "com.example.backend.**"})
public class BackendApplication {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SpringApplication.run(BackendApplication.class, args);
        System.out.println(sdf.format(date) + "----------启动应用：Backend ----------");
    }

}
