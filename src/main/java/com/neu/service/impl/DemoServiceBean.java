package com.neu.service.impl;

import com.neu.beans.Lesson;
import com.neu.mapper.DemoMapper;
import com.neu.mapper.FrontLessonMapper;
import com.neu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceBean implements DemoService {
    @Autowired
    DemoMapper demoMapper;

    @Autowired
    FrontLessonMapper lessonMapper;
    @Override
    public List<Lesson> findLessons() {
        // TODO Auto-generated method stub
        System.out.println("..........DemoService..........findLessons.........");
        List<Lesson> list;

        try {
            list = demoMapper.findLessons();
            System.out.println("............DemoService..........findLessons.....OK");
        } catch (Exception e) {
            list = null;
            System.out.println("............DemoService..........findLessons.....failed");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
	@Override
	public List<String> findlessonType() {
		// TODO Auto-generated method stub
		List<String> list;
		System.out.println("............DemoService.......lessonMapper............findlessonType");
		try {
			list=lessonMapper.findTypeList();
		} catch (Exception e) {
			list=null;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(String s:list){
			System.out.println("....."+s+"....");
		}
		return list;
	}
}

