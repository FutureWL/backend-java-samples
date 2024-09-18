package io.github.futurewl.sbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:application-context.xml"})
public class CoreConfigApplication implements CommandLineRunner {


    @Autowired
    private User user;

    public static void main(String[] args) {
        SpringApplication.run(CoreConfigApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
