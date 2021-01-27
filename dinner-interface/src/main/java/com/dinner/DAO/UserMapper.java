package com.dinner.DAO;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dinner.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}