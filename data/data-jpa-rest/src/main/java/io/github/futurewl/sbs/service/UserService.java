package io.github.futurewl.sbs.service;

import io.github.futurewl.sbs.entity.User;

public interface UserService {

    /**
     *
     * @param username
     * @return
     */
    User findByUsername(String username);

}
