package com.example.common.config;

import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "spring.application")
public class ApplicationProperties {

    private Boolean debug;

    private String name;

    private String env;

    private List<String> profiles;

    private Map<String, String> properties;

    private final Myapp myapp = new Myapp();

    @Data
    public class Myapp {

        private Integer id;

        private String name;
    }
}
