package com.example.frontend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.mybatisflex.core.audit.AuditManager;
import com.mybatisflex.core.audit.ConsoleMessageCollector;
import com.mybatisflex.core.audit.MessageCollector;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.common.**", "com.example.frontend.**"})
@MapperScan(basePackages = {"com.example.common.module.*.mapper"})
public class FrontendApplication {

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        SpringApplication.run(FrontendApplication.class, args);
        System.out.println(sdf.format(date) + "----------启动应用：Frontend ----------");

        // if (debug) {
            //开启审计功能
            AuditManager.setAuditEnable(true);
            //设置 SQL 审计收集器
            MessageCollector collector = new ConsoleMessageCollector();
            AuditManager.setMessageCollector(collector);
        // }
    }

}
