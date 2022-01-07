package com.management.dao;

import com.management.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    User queryById(long id);

    /**
     * 添加教师
     * @param user
     * @return
     */
    int addUser(@Param("user") User user);
}
