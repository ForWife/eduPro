package com.neu.service.impl;

import com.neu.beans.Teacher;
import com.neu.mapper.BackTeacherMapper;
import com.neu.service.BackTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class BackTeacherServiceImpl implements BackTeacherService {
    @Autowired
    BackTeacherMapper teacherMapper;
    @Override
    public List<Teacher> findTeachers() {
        try {
            return teacherMapper.findTeachers();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
