package com.neu.controller;

import com.neu.beans.Enterprise;
import com.neu.beans.User;
import com.neu.controller.BackTeacherHandler.Update;
import com.neu.controller.BackTeacherHandler.Update.Data;
import com.neu.service.BackCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
    class Data{
    	String src;
    	public String getSrc() {
			return src;
		}
		public void setSrc(String src) {
			this.src = src;
		}
		Data(String src){
			this.src=src;
		}
    }
    @RequestMapping(value = "/back/uploadcompanyvideo")
    @ResponseBody
    public Map<String,Object> upload(HttpServletRequest request, MultipartFile file){
        String filename=System.currentTimeMillis()+file.getOriginalFilename();
        String path=request.getServletContext().getRealPath("/");
        File f=new File(path);
        String ppath=f.getParent();
        path=path+"/upload";
        Map<String,Object> map=new HashMap<>();
        if (!new File(path).exists()) {
            new File(path).mkdir();
        }
        File dest=new File(path,filename);
        try {
            file.transferTo(dest);
            map.put("code", 0);
            map.put("data", new Data(filename));
            return map;
        } catch (IOException e) {
            e.printStackTrace();
            map.put("code", 1);
            return map;
        }
//        return "{\"code\":0,\"data\":{\"src\":\""+filename+"\"}}";
    }
    @RequestMapping(value = "/back/editcompany")
    @ResponseBody
    public String editcompany(HttpServletRequest request,Enterprise enterprise) {
    	HttpSession session=request.getSession();
        int qid=((User)session.getAttribute("user")).getQid();
        enterprise.setQid(qid);
        if (companyService.editCompany(enterprise)){
            return "{\"result\":\"success\"}";
        }else return "{\"result\":\"failed\"}";
    }
}
