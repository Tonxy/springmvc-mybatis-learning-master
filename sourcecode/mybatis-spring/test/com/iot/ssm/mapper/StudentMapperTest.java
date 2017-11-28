package com.iot.ssm.mapper;

import com.iot.ssm.po.student;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 吴焰
 * @Date 2017/11/27.
 */


public class StudentMapperTest {
    @Test
    public void testFindStuById() throws Exception{
        ApplicationContext application=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        StudentMapper studentMapper= (StudentMapper) application.getBean("studentMapper");
        student stu=studentMapper.findStuById(1);
        System.out.println(stu);
    }

    @Test
    public void testFindStuById02() throws Exception{
        ApplicationContext application=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        StudentMapper studentMapper= (StudentMapper) application.getBean("studentMapper");
        student stu=studentMapper.findStuById02(1);
        System.out.println(stu);
    }
}
