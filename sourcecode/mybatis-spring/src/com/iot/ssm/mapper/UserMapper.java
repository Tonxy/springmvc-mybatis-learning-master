package com.iot.ssm.mapper;

import com.iot.ssm.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Brian on 2016/2/24.
 */
public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;

    User findUserById02(@Param("id") int id, @Param("sex") String s) throws Exception;

    User findUserByName(@Param("username") String name,@Param("sex") String sex) throws Exception;

    List<User> findUserListByAddr(List<String> userAddrList) throws Exception;

    List<User> findUserListByAddr02(String userAddr) throws Exception;

    List<User> findUserByChoose(Map<String,Object> map) throws Exception;

    void updateById(@Param("username") String username,@Param("address") String address,@Param("id") int id) throws  Exception;
}
