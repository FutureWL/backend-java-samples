package io.github.futurewl.sbs.service;

import io.github.futurewl.sbs.common.ResponseResult;
import io.github.futurewl.sbs.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
