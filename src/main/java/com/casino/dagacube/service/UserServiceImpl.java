//package com.casino.dagacube.service;
//
//import com.casino.dagacube.dto.UserDto;
//import com.casino.dagacube.repository.UserRepository;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
//    private UserRepository userRepository;
//
//    @Override
//    public Long saveUser(UserDto userDto) {
//        userDto.setPassword(bCryptPasswordEncoder()
//                .encode(userDto.getPassword()));
//        return userRepository.save(UserDto.fromDto(userDto)).getId();
//    }
//
//    @Bean
//    private BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
