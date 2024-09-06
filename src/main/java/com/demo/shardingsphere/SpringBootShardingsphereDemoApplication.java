package com.demo.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.shardingsphere.mapper")
public class SpringBootShardingsphereDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootShardingsphereDemoApplication.class, args);
    }

}
