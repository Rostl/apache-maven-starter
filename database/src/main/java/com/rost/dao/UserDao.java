package com.rost.dao;

import com.rost.entity.UserEntity;

import java.util.Optional;

public class UserDao {
    public Optional<UserEntity> findById(long id) {
        return Optional.ofNullable(UserEntity.builder()
                .id(id)
                .firstName("Ivan")
                .age(18)
                .build());
    }
}