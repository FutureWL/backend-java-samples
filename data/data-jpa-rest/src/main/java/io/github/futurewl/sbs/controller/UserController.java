package io.github.futurewl.sbs.controller;

import io.github.futurewl.sbs.entity.User;
import io.github.futurewl.sbs.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findByUsername")
    public User findByUsername(String username) {
        return userService.findByUsername(username);
    }


}
