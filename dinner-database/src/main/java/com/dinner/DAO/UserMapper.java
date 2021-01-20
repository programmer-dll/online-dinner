package Dao;

import Entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String username);

    int insert(User record);

    User selectByPrimaryKey(String username);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}