/**
 * @program: springmvc002-ssm
 * @description:
 * @author: 作者名字
 * @create: 2023-01-19 16:19
 **/
package com.st.service;

import com.st.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * /user/selectUserPage?userName=z&userSex=男&page=null
     * @param userName
     * @param userSex
     * @param startRow
     * @return
     */
    List<User> selectUserPage(String userName, String userSex, int startRow);

    /**
     * /user/getRowCount?userName=z&userSex=男
     * @param userName
     * @param userSex
     * @return
     */
    int getRowCount(String userName, String userSex);

    /**
     * /user/ deleteUserById?userId= 15968162087363060
     * @param userId
     * @return
     */
    int deleteUserById(String userId);

    /**
     * /user/createUser(参数见下面)
     * @param user
     * @return
     */
    int createUser(User user);
    /**
     * /user/updateUserById(参数见以下)
     * @param user
     * @return
     */
    int updateUserById(User user);
}
