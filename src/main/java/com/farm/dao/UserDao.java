package com.farm.dao;

import com.farm.entity.User;
import com.farm.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User的数据访问接口
 *
 * @author 关文聪
 * @version 1.0
 * @email 530711667@qq.com
 */
public interface UserDao {

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserName(String userName);

    User selectByUserEmail(String userEmail);

    User selectById(int userId);

    int changeStatus(User record);
}
