package com.mtjsoft.www.springbootmybatisredis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mtjsoft.www.springbootmybatisredis.mapper")
public class SpringbootmybatisredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisredisApplication.class, args);
    }
}
