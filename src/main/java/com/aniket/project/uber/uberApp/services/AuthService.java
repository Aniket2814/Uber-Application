package com.aniket.project.uber.uberApp.services;

import com.aniket.project.uber.uberApp.dto.DriverDto;
import com.aniket.project.uber.uberApp.dto.SignupDto;
import com.aniket.project.uber.uberApp.dto.UserDto;

public interface AuthService {
String login(String email,String password);
UserDto signup(SignupDto signupDto);

    DriverDto onBoardNewDriver(Long userId);
}
