package com.iot.ssm.mapper;

import com.iot.ssm.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    /**
    *@Author:wuyan
    *@Description:
    *@Date:20:29 2017/11/27
    */

    @Test
    public void testFindUserById() throws Exception {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");

        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");

        User user = userMapper.findUserById(1);

        System.out.println(user);

    }

    @Test
    public void testFindUserById02() throws Exception {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById02(1,"f");
        System.out.println(user);

    }

    @Test
    public void testFindUserByName() throws Exception{
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserByName("wuyan","m");
        System.out.println(user);
    }

    @Test
    public void testfindUserListByAddr() throws Exception{
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        ArrayList<String> userAddrList=new ArrayList<>();
        userAddrList.add("shu");
        userAddrList.add("USA");
        List<User> list=userMapper.findUserListByAddr(userAddrList);
        for (User user:list) {
            System.out.println(user);
        }
    }

    @Test
    public void testfindUserListByAddr02() throws Exception{
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<User> userList=userMapper.findUserListByAddr02("shu");
        for (User user:userList
             ) {
            System.out.println(user);
        }
    }
    @Test
    public void testfindUserByChoose() throws Exception{
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        Map<String,Object> map=new HashMap<>();

        map.put("name","wuyan");
        map.put("id",1);
        map.put("sex","m");
        map.put("address","");

        List<User> list=userMapper.findUserByChoose(map);
        for (User user:list
             ) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdateById() throws Exception{
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        userMapper.updateById("xjp","bej",1);
        User user=userMapper.findUserById(1);
        System.out.println(user);
    }
}