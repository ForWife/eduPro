package com.neu.controller;

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
	public List<FreeListen> getfreeListenBook(@RequestParam int currectPage) throws Exception{
		int pageStart = (currectPage - 1) * 20;
		int pageNumber = 20;
		return backGetFreeListenBookService.getfreeListenBook(pageStart, pageNumber);
	}
	
	@RequestMapping(value = "/back/back_bespeak_getPageNumber")
	@ResponseBody
	public int getPageNumber() throws Exception {
		System.out.println("ceshi");
		int allPageNumber = backGetFreeListenBookService.getPageNumber();
		if(allPageNumber % 20 == 0) {
			return allPageNumber / 20;
		}else {
			return (allPageNumber / 20) + 1;
		}
	}
}
