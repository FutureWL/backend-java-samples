package io.github.futurewl.sbs.service;

import io.github.futurewl.sbs.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
