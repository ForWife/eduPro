package com.neu.controller;

import java.util.List;

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
}
