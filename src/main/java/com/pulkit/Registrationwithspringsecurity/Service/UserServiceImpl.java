package com.pulkit.Registrationwithspringsecurity.Service;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pulkit.Registrationwithspringsecurity.Repository.UserRepository;
import com.pulkit.Registrationwithspringsecurity.model.Role;
import com.pulkit.Registrationwithspringsecurity.model.User;
import com.pulkit.Registrationwithspringsecurity.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(UserRegistrationDto uRegistrationDto) {
        User user =  new User(
            uRegistrationDto.getFirstname(), uRegistrationDto.getLastname(), 
            uRegistrationDto.getEmail(), uRegistrationDto.getPassword(),
            Arrays.asList(new Role("ROLE_USER")));
        User response =  userRepository.save(user);
        return response;
    }
    
    
}
