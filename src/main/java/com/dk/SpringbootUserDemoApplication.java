package com.dk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 */
@SpringBootApplication
@MapperScan("com.dk.mapper")
public class SpringbootUserDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootUserDemoApplication.class, args);
    }
}
