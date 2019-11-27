package com.dao;

import com.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    UserInfo getUserById(@Param("id") int id);
}
