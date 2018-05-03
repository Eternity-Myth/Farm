package com.farm.dao;

import com.farm.entity.User;

/**
 * 测试案例：User的数据访问接口
 *
 * @author Guan WenCong
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface UserDao {

    int insert(User user);

    int updateBaseInfoById(User user);

    User selectById(int userId);

    User selectByUserName(String userName);

    User selectByUserEmail(String userEmail);
}
