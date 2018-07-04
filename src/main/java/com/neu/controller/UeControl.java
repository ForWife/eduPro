//package com.neu.controller;
//
//import com.baidu.ueditor.ActionEnter;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.Map;
//
//@Controller
//public class UeControl {
//
//        @RequestMapping(value="/back/ue/config")
//        public void config(HttpServletRequest request, HttpServletResponse response) {
//            System.out.println("ue-config");
//            response.setContentType("application/json");
//            String rootPath = request.getSession()
//                    .getServletContext().getRealPath("/");
//            System.out.println(rootPath+request.getContextPath()+request.getRequestURI());
//            try {
//                String exec = new ActionEnter(request, rootPath).exec();
//                PrintWriter writer = response.getWriter();
//                writer.write(exec);
//                writer.flush();
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    @RequestMapping(value = "/uploadImage")
//    @ResponseBody
//            public Map<String,String> upload(HttpServletRequest request, MultipartFile upfile){
//                String filename=System.currentTimeMillis()+upfile.getOriginalFilename();
//                String path=request.getServletContext().getRealPath("/");
//                File f=new File(path);
//                String ppath=f.getParent();
//                path=path+"/upload";
//                Map<String,String> map=new HashMap<>();
//                if (!new File(path).exists()) {
//                    new File(path).mkdir();
//                }
//                File dest=new File(path,filename);
//                try {
//                    upfile.transferTo(dest);
//                    //是否上传成功
//                    map.put("state", "SUCCESS");
//                    //现在文件名称
//                    map.put("title", filename);
//                    //文件原名称
//                    map.put("original", upfile.getOriginalFilename());
//                    //文件类型 .+后缀名
//                    map.put("type", filename.substring(upfile.getOriginalFilename().lastIndexOf(".")));
//                    //文件路径
//                    map.put("url", "/"+filename+"/getImage.do");
//                    //文件大小（字节数）
//                    map.put("size", upfile.getSize()+"");
//                    return map;
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    return map;
//        }
////        return "{\"code\":0,\"data\":{\"src\":\""+filename+"\"}}";
//    }
//
//
//}
