package com.tuantuan.helper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tuantuan.helper")
public class TuantuanHelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuantuanHelperApplication.class, args);
    }

}
