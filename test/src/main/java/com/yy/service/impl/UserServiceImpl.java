package com.yy.service.impl;

import com.yy.domain.User;
import com.yy.mapper.UserMapper;
import com.yy.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private UserMapper mapper;

    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void save(User user) {
        mapper.insert(user);
    }

    @Override
    public void update(User user) {
        mapper.updateById(user);
    }

    @Override
    public void delete(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public User getOne(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<User> getAll() {
        return mapper.selectAll();
    }
}
