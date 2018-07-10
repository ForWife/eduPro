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
import java.util.Date;
import java.util.List;

@Controller
public class BackQualityHandler {
    @Autowired
    BackQualityService qualityService;

    @RequestMapping(value = "/back/findcategory")
    @ResponseBody
    public List<String> findcategory(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return qualityService.findCategory(user.getQid());
    }

    @RequestMapping(value = "/back/findbranchsbylid")
    @ResponseBody
    public List<Integer> findbranches(int lid) {
        return qualityService.findBranchIds(lid);
    }
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
    public String deleteQuality(int lid) {
        if (qualityService.deleteQuanlity(lid)) {
            return "{\"result\":\"success\"}";
        } else return "{\"result\":\"failed\"}";
    }

    @RequestMapping(value = "/back/editquality")
    @ResponseBody
    public String editquality(Lesson lesson) {
        if (qualityService.editQuality(lesson)) {
            return "{\"result\":\"success\"}";
        } else return "{\"result\":\"failed\"}";
    }

    @RequestMapping(value = "/back/addquality")
    @ResponseBody
    public String addquality(HttpServletRequest request, Lesson lesson) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        lesson.setQid(user.getQid());
        lesson.setStatus("进行中");
        lesson.setPubtime(new Date());
        if (qualityService.addQuality(lesson)) {
            return "{\"result\":\"success\"}";
        } else return "{\"result\":\"failed\"}";
    }
}
