package io.github.futurewl.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Webflux 应用
 */
@RestController
@SpringBootApplication
public class WebfluxApp {


    @GetMapping
    public String hello() {
        return "hello webflux";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebfluxApp.class, args);
    }
}
