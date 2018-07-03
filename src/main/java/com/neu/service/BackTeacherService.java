package com.neu.service;

import com.neu.beans.Teacher;

import java.util.List;

public interface BackTeacherService {
    public List<Teacher> findTeachers();
    public boolean deleteTeacher(int tid);
    public boolean addTeacher(Teacher teacher);
}
