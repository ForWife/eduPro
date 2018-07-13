package com.neu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.po.MessageAbout;
import com.neu.service.FrontCircleOfFriendsService;

@Controller
public class FrontCircleOfFriendsHandler {

	@Autowired
	FrontCircleOfFriendsService circleOfFriendsService;
	
	@RequestMapping(value="/front/findCircleOfFriends")
	@ResponseBody
	public List<MessageAbout> findCircleOfFriends(int qid) throws Exception{
		List<MessageAbout> messageAboutList = circleOfFriendsService.getMessageAbout(qid);
		return messageAboutList;
	}
	@RequestMapping(value="/front/like")
	@ResponseBody
	public String like(int mid,String nickname) throws Exception{
		//需要传入点赞人姓名和mid朋友圈id
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mid", mid);
		map.put("nickname", nickname);
		boolean isok = circleOfFriendsService.dolike(map);
		if(isok==true){
			return "{\"result\":\"success\"}";
		}else{
			return "{\"result\":\"false\"}";
		}
	}
	
	@RequestMapping(value="/front/reply")
	@ResponseBody
	public String reply(int mid,String nickname,String content) throws Exception{
		System.out.println("..........>>FrontCircleOfFriendsHandler.....reply");
		Map<String , Object> map = new HashMap<>();
		map.put("mid", mid);
		map.put("nickname", nickname);
		map.put("content", content);
		boolean isok = circleOfFriendsService.addreply(map);
		if(isok){			
			System.out.println("..........>handler 点赞 成功");
			return "{\"result\":\"success\"}";
		}else{
			System.out.println("..........>handler failed");
			return "{\"result\":\"failed\"}";
		}
	}
}
