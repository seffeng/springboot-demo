package com.example.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "testconfig")
public class TestProperties {

    private AppConfig appA;
    private AppConfig appB;

    @Data
    public static class AppConfig {
        private int id;
        private String name;
    }
}
