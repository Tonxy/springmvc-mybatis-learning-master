package com.iot.mybatis.mapper;

import com.iot.mybatis.po.Classes;
import com.iot.mybatis.po.Teacher;
import com.iot.mybatis.po.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class classTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 创建sqlSessionFactory

        // mybatis配置文件
        String resource = "SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);
    }

    @Test
    public void testGetClass(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * config.sqlmap.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
         * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "config.sqlmap.classMapper.getClass";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Classes对象返回
        Classes clazz = sqlSession.selectOne(statement,1);//查询class表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(clazz);//打印结果：Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1]]
    }

    @Test
    public void testGetClass2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        /**
         * 映射sql的标识字符串，
         * config.sqlmap.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
         * getClass2是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "config.sqlmap.classMapper.getClass2";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Classes对象返回
        Classes clazz = sqlSession.selectOne(statement,1);//查询class表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(clazz);//打印结果：Classes [id=1, name=class_a, teacher=Teacher [id=1, name=teacher1]]
    }
    @Test
    public void testGetClass3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
          /**
         * 映射sql的标识字符串，
         * config.sqlmap.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
         * getClass2是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        String statement = "config.sqlmap.classMapper.getClass3";//映射sql的标识字符串
        //执行查询操作，将查询结果自动封装成Classes对象返回
        Classes clazz2=sqlSession.selectOne(statement,2);
        Classes clazz = sqlSession.selectOne(statement,1);//查询class表中id为1的记录
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(clazz);
        System.out.println(clazz2);
    }
/**
*@Author:wuyan
*@Description:
*@Date:22:05 2017/11/26
*/
    @Test
    public void testGetTeacher(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statement="config.sqlmap.classMapper.getTeacher";
        Teacher teacher=sqlSession.selectOne(statement,1);
        sqlSession.close();
        System.out.println(teacher);
    }

    @Test
    public void testGetStudent(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statement="config.sqlmap.classMapper.getStudent";
        student stu =sqlSession.selectOne(statement,1);
        sqlSession.close();
        System.out.println(stu);
    }
    /*
        验证不用resultMap，用resultType返回数据，
        sql语句中的列名应与pojo的变量名相同，不同时可以有两种解决办法
        ① 使用resultMap
        ② 使用sql语句中列名的别名，与pojo变量名相同
     */
    @Test
    public void testGetStudent02(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        String statement="config.sqlmap.classMapper.getStudent02";
        student stu2=sqlSession.selectOne(statement,2);
        sqlSession.close();
        System.out.println(stu2);
    }
}
