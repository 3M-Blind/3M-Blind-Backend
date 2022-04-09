package com.blind.blind_backend.service;

import com.blind.blind_backend.domain.DTO.user.UserRegDTO;
import com.blind.blind_backend.domain.User;
import com.blind.blind_backend.respository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void regUser(UserRegDTO userRegDTO){
        User user = User.builder()
                .username(userRegDTO.getUsername())
                .nickname(userRegDTO.getNickname())
                .email(userRegDTO.getEmail())
                .password(userRegDTO.getPass()).build();

        userRepository.save(user);
    }


}
