package com.yy.mapper;

import com.yy.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int insert(User user);

    int deleteById(@Param("id") Long id);

    int updateById(User user);

    User selectById(Long id);

    List<User> selectAll();
}
