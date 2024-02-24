package com.pulkit.Registrationwithspringsecurity.Service;

import com.pulkit.Registrationwithspringsecurity.model.User;
import com.pulkit.Registrationwithspringsecurity.web.dto.UserRegistrationDto;

public interface UserService {
    public User saveUser(UserRegistrationDto user);
}
