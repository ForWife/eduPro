package com.neu.controller;

import com.neu.beans.Enterprise;
import com.neu.beans.User;
import com.neu.service.BackCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BackCompanyHandler {
    @Autowired
    BackCompanyService companyService;
    @RequestMapping(value = "/back/get_company")
    @ResponseBody
    public Enterprise getCompany(HttpServletRequest request){
        HttpSession session=request.getSession();
        int qid=((User)session.getAttribute("user")).getQid();
        return companyService.findCompanyByQid(qid);
    }
}
