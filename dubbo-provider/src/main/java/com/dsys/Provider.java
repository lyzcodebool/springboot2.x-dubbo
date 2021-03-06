package com.dsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dsys")
@MapperScan("com.dsys.dao")
public class Provider {
    public static void main(String args[]){
        SpringApplication.run(Provider.class,args);
    }
}
