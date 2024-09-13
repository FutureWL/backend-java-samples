package io.github.futurewl.sbs;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminServerApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerApp.class, args);
    }
}
