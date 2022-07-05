package ru.vasin.springsecuritydemo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.vasin.springsecuritydemo.model.User;
import ru.vasin.springsecuritydemo.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
