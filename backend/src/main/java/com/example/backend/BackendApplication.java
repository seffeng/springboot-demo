package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SpringApplication.run(BackendApplication.class, args);
        System.out.println(sdf.format(date) + "----------启动应用：Backend ----------");
    }

}
