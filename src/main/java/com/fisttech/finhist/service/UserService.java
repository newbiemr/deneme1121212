package com.fisttech.finhist.service;

import com.fisttech.finhist.repository.UserInfoRepository;
import com.fisttech.finhist.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserInfoRepository userInfoRepository;

    public UserService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public List<UserInfo> getUsers() {
        return userInfoRepository.findAll();
    }

    public UserInfo createUser(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

}