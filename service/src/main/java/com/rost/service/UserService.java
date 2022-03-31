package com.rost.service;

import com.rost.dao.UserDao;
import com.rost.dto.UserDto;
import com.rost.entity.UserEntity;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public Optional<UserDto> getUser(long id) {
        UserEntity userEntity = userDao.findById(id)
                .orElseThrow(() ->new IllegalArgumentException("Something go`s wrong !!!"));
        return mapUserEntityToUserDto(userEntity);
    }

    private Optional<UserDto> mapUserEntityToUserDto(UserEntity userEntity) {
        return Optional.ofNullable(UserDto.builder()
                .name(userEntity.getFirstName())
                .age(userEntity.getAge())
                .build());
    }
}