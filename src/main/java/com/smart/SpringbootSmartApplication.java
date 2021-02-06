package com.smart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author hacker
 * @date 2020/12/26 15:17
 * @describe
 */
@SpringBootApplication
@MapperScan("com.smart.mapper")
@Configuration
public class SpringbootSmartApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSmartApplication.class, args);
    }
}
