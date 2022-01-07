package com.grademanagement.dao;

import com.grademanagement.entity.User;

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
    int addUser(User user);
}
