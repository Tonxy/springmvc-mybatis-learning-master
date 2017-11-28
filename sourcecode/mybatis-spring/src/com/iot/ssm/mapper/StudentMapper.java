package com.iot.ssm.mapper;

import com.iot.ssm.po.student;

/**
 * @Author 吴焰
 * @Date 2017/11/27.
 */
public interface StudentMapper {
    student findStuById(int id) throws Exception;
    student findStuById02(int id) throws Exception;
}
