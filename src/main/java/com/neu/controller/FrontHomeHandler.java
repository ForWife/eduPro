package com.neu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.beans.FreeListen;
import com.neu.beans.Lesson;
import com.neu.beans.Swiper;
import com.neu.service.FrontHomeService;

@Controller
public class FrontHomeHandler {
	
	@Autowired
	FrontHomeService homeService;
	
	@RequestMapping(value="/front/getImgs")
	@ResponseBody
	public List<Swiper> getImgs(int qid) throws Exception{
		System.out.println("...>FrontHomeHandler....>getImgs");
		List<Swiper> list = homeService.getHomeImg(qid);
		for (Swiper swiper : list) {
			System.out.println(swiper.getImgurl());
		}
		return list;
	}
	
	
//	Ê×Ò³¿Î³Ì
	@RequestMapping(value="/front/findTwoNewLesson")
	@ResponseBody
	public List<Lesson> findTwoNewLesson(int qid) throws Exception{
		System.out.println(".....homehandler........findTwoNewLesson.");
		return homeService.getTwoLesson(qid);
	}
	
//	Ê×Ò³ÊÔÌý¿Î
	@RequestMapping(value= "/front/findTwoNewFreeListen")
	@ResponseBody
	public List<FreeListen> findTwoFreeListen(int qid) throws Exception{
		return homeService.getTwoFreeListen(qid);
	}
	
}
