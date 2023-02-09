/**
 * @program: springmvc002-ssm
 * @description: 用户业务实现类
 * @author: tiki
 * @create: 2023-01-19 16:29
 **/
package com.st.service.impl;

import com.st.mapper.UserMapper;
import com.st.pojo.User;
import com.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    // 数据访问层对象
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUserPage(String userName, String userSex, int startRow) {
        return userMapper.selectUserPage(userName, userSex, startRow);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return userMapper.updateUserById(user);
    }
}
