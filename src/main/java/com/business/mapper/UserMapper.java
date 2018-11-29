package com.business.mapper;

import com.business.model.User;

public interface UserMapper {
    public User gitUser(int id);

    public void deleteUser(int id);
}
