package com.aimei.beautyshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableTransactionManagement
@MapperScan("com.aimei.beautyshop.dao")
@SpringBootApplication
@EnableSwagger2
public class BeautyshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautyshopApplication.class, args);
    }

}
