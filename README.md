# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#using.devtools)

### 启动示例
```shell
### 子模块编译前父模块先执行
$ mvn install

### 子应用执行
java -Dspring.config.additional-location=config/application.yml -Dserver.port=8080 -jar frontend/target/frontend-0.0.1-SNAPSHOT.jar
```

### 配置文件

```shell
### config/application.yml, config/application-xxx.yml
spring:
  profiles:
    active: xxx  # 启用对应配置 application-xxx.yml

### 配置内容参考文件：config/application-dev.yml
```
