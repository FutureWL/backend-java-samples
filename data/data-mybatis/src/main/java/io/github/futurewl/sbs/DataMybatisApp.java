package io.github.futurewl.sbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.futurewl.sbs.mapper")
public class DataMybatisApp {
    public static void main(String[] args) {
        SpringApplication.run(DataMybatisApp.class, args);
    }
}
