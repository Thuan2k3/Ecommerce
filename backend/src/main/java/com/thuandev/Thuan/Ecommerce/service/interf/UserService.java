package com.thuandev.Thuan.Ecommerce.service.interf;

import com.thuandev.Thuan.Ecommerce.dto.LoginRequest;
import com.thuandev.Thuan.Ecommerce.dto.Response;
import com.thuandev.Thuan.Ecommerce.dto.UserDto;
import com.thuandev.Thuan.Ecommerce.entity.User;

public interface UserService {
    Response register(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
