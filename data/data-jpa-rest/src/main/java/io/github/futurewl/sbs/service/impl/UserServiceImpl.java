package io.github.futurewl.sbs.service.impl;

import io.github.futurewl.sbs.entity.User;
import io.github.futurewl.sbs.repository.UserRepository;
import io.github.futurewl.sbs.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
