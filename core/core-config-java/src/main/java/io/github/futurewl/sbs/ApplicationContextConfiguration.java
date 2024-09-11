package io.github.futurewl.sbs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfiguration {

    @Bean
    public User user() {
        return new User("用户名", "密码");
    }

}
