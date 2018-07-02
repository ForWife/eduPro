package com.neu.controller;

import com.neu.beans.Teacher;
import com.neu.service.BackTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BackTeacherHandler {
    @Autowired
    BackTeacherService teacherService;
    @ResponseBody
    @RequestMapping(value = "/back/findteachers")
    public List<Teacher> findteachers(){
        return teacherService.findTeachers();
    }
}
