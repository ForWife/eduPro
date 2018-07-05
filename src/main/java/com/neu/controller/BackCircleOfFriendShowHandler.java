package com.neu.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.beans.Message;
import com.neu.beans.MessageImg;
import com.neu.service.BackGetAllMessageService;
import com.neu.service.impl.BackGetAllMessageServiceImpl;

@Controller
public class BackCircleOfFriendShowHandler {
	@Autowired
	private BackGetAllMessageService backGetAllMessageService;
	@RequestMapping(value = "/back/back_getAllMessage")
	@ResponseBody
	public List<Message> getAllMessage(HttpServletRequest request) throws Exception{
		List<Message> result = backGetAllMessageService.getAllMessage(1);
		for(Message r : result) {
			for(MessageImg m : ((Message) r).getMessageImg()) {
				System.out.println(request.getServletContext().getRealPath("/"));
				File file = new File(request.getServletContext().getRealPath("/") + m.getImgurl());
				System.out.println(file.getCanonicalPath());
				FileInputStream fis = new FileInputStream(file);
				BufferedImage bufferedImg = ImageIO.read(fis);
				int imgWidth = bufferedImg.getWidth();
				int imgHeight = bufferedImg.getHeight();
				if(imgWidth > imgHeight) {
					m.setFlag(0);
				}else {
					m.setFlag(1);
				}
			}
		}
		System.out.println(result);
		System.out.println("测试");
		return result;
	}
}
