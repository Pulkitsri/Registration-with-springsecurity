package com.pulkit.Registrationwithspringsecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pulkit.Registrationwithspringsecurity.model.User;
import com.pulkit.Registrationwithspringsecurity.web.dto.UserRegistrationDto;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User save(UserRegistrationDto user);
    
}
