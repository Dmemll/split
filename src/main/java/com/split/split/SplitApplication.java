package com.split.split;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.split.split.mapper")
public class SplitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitApplication.class, args);
    }

}
