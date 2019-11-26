package com.yy.service;

import com.yy.domain.User;

import java.util.List;

public interface IUserService {

    void save(User user);

    void update(User user);

    void delete(Long id);

    User getOne(Long id);

    List<User> getAll();
}
