package com.bluna.bluna.service;

import com.bluna.bluna.domain.user.Account;
import com.bluna.bluna.domain.user.UserRepository;
import com.bluna.bluna.payload.request.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public String signup (UserRequest request) {
        userRepository.save(Account.builder()
                .userId(request.getUserId())
                .password(request.getPassword())
                .userName(request.getUserName())
                .build());
        return "Success";
    }
}
