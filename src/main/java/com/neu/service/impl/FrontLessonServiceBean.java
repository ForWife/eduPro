package com.neu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.Address;
import com.neu.beans.Lesson;
import com.neu.mapper.FrontLessonMapper;
import com.neu.po.LessonAndAddress;
import com.neu.service.FrontLessonService;

@Service
public class FrontLessonServiceBean implements FrontLessonService {
	@Autowired
	 FrontLessonMapper lessonMapper;
	
	@Override
	public Map<String, List<Lesson>> findLessonListByCategory() throws Exception {
		Map<String, List<Lesson>> map = new HashMap<>();
		
		List<String> list =  lessonMapper.findTypeList();
		for(String s:list){
			System.out.println(".................s:"+s);
			List<Lesson> lessonList= lessonMapper.findLessehByCategory(s);
			map.put(s, lessonList);
			System.out.println("...........put list into map  OK");
		}
		return map;
	}

	public Lesson findLessonById(int lid) throws Exception{
		System.out.println("...............LessonService..findLessonById");
		Lesson lesson = lessonMapper.getLesssonById(lid);
		return lesson;
	}

	@Override
	public LessonAndAddress findLessonAndAddressById(int lid) throws Exception {
		LessonAndAddress lessonAndAddress = new LessonAndAddress();
		Lesson lesson = lessonMapper.getLesssonById(lid);
		Address address = lessonMapper.getLessonAdderss(lid);
		lessonAndAddress.setLesson(lesson);
		lessonAndAddress.setAddress(address);
		return lessonAndAddress;
	}
}
