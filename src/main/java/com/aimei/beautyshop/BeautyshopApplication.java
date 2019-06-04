package com.aimei.beautyshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aimei.beautyshop.dao")
@SpringBootApplication
public class BeautyshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautyshopApplication.class, args);
    }

}
