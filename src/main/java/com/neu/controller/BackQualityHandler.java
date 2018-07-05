package com.neu.controller;

import com.neu.beans.Lesson;
import com.neu.beans.User;
import com.neu.service.BackQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BackQualityHandler {
    @Autowired
    BackQualityService qualityService;

    @ResponseBody
    @RequestMapping(value = "/back/findquality")
    public List<Lesson> findquality(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return qualityService.findQuanlity(user.getQid());
    }

    @ResponseBody
    @RequestMapping(value = "/back/findqualitybyid")
    public Lesson findqualitybyid(int lid) {
        return qualityService.finQualityById(lid);
    }

    @RequestMapping(value = "/back/deletequality")
    @ResponseBody
    public String deleteTeacher(int lid) {
        if (qualityService.deleteQuanlity(lid)) {
            return "{\"result\":\"success\"}";
        } else return "{\"result\":\"failed\"}";
    }
}
