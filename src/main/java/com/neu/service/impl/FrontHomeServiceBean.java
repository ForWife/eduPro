package com.neu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.FreeListen;
import com.neu.beans.Lesson;
import com.neu.beans.Swiper;
import com.neu.mapper.FrontHomeMapper;
import com.neu.service.FrontHomeService;

@Service
public class FrontHomeServiceBean implements FrontHomeService {

	@Autowired
	FrontHomeMapper frontHomeMapper;
	
	@Override
	public List<Swiper> getHomeImg(int qid) throws Exception {
		System.out.println(".......>FrontHomeService.....>getHomeImg");
		List<Swiper> list = frontHomeMapper.getHomeImg(qid);
		return list;
	}

	@Override
	public List<Lesson> getTwoLesson(int qid) throws Exception {
		System.out.println(".......>FrontHomeService.....>getTwoLesson");
		return frontHomeMapper.getnewTwoLesson(qid);
	}

	@Override
	public List<FreeListen> getTwoFreeListen(int qid) throws Exception {
		System.out.println(".......>FrontHomeService.....>getTwoFreeListen");
		return frontHomeMapper.getNewTwoFreeListen(qid);
	}

}
