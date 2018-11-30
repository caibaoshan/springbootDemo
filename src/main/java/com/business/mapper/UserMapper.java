package com.business.mapper;

import com.business.model.User;
import org.springframework.stereotype.Repository;

public interface UserMapper {
    User gitUser(int id);

    void deleteUser(int id);
}
