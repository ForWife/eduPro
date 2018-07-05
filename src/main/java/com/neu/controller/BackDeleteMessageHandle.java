package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.neu.service.BackDeleteMessageService;

@Controller
public class BackDeleteMessageHandle {
	@Autowired
	private BackDeleteMessageService backDeleteMessageService;
	
	public int deleteMessage(@RequestParam int mid,int imgNumber, int likeNumber, int replyNumber) throws Exception {
		return backDeleteMessageService.deleteMessage(mid, imgNumber, likeNumber, replyNumber);
	}
	
}
