package com.sxk.odyssey;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(value ={"com.sxk.controller","com.sxk.service","com.sxk.scheduled"})
@MapperScan(basePackages = {"com.sxk.dao"})
public class OdysseyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OdysseyApplication.class, args);
    }

}
