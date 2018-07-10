package com.neu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.beans.FreeListen;
import com.neu.service.BackGetFreeListenBookService;

@Controller
public class BackGetFreeListenBookHolder {
	@Autowired
	private BackGetFreeListenBookService backGetFreeListenBookService;
	@RequestMapping(value = "/back/back_bespeak_getfreeListenBook")
	@ResponseBody
	public List<FreeListen> getfreeListenBook(@RequestParam int currectPage,
											  @RequestParam String titleKey,
											  @RequestParam String listenState,
											  @RequestParam String listenStartTime,
											  @RequestParam String listenEndTime) throws Exception{
		int pageStart = (currectPage - 1) * 20;
		int pageNumber = 20;
		if(titleKey == null && listenState == null && listenStartTime == null && listenEndTime == null) {
			System.out.println("ceshi1");
			return backGetFreeListenBookService.getfreeListenBook(pageStart, pageNumber);
		}else {
			System.out.println("ceshi2");
			return backGetFreeListenBookService.getfreeListenBookByeInput(pageStart, pageNumber, titleKey, listenState, listenStartTime, listenEndTime);
		}
		
	}
	
	@RequestMapping(value = "/back/back_bespeak_getPageNumber")
	@ResponseBody
	public int getPageNumber() throws Exception {
		int allPageNumber = backGetFreeListenBookService.getPageNumber();
		if(allPageNumber % 20 == 0) {
			return allPageNumber / 20;
		}else {
			return (allPageNumber / 20) + 1;
		}
	}
	@RequestMapping(value = "/back/back_getfreeListenBookByeInput")
	@ResponseBody
	public List<FreeListen> getfreeListenBookByeInput(int pageStart, int pageNumber, String titleKey, String listenState, String listenStartTime, String listenEndTime) throws Exception{
		
		return backGetFreeListenBookService.getfreeListenBookByeInput(0, 20, "大咔","待处理",("2018-05-26 17:54:33"),("2018-05-26 17:55:34"));
	}
}
