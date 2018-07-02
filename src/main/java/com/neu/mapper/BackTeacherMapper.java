package com.neu.mapper;

import com.neu.beans.Teacher;

import java.sql.SQLException;
import java.util.List;

public interface BackTeacherMapper {
    public List<Teacher> findTeachers() throws SQLException;
}
