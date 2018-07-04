package com.neu.service;

import java.util.List;
import java.util.Map;


import com.neu.beans.Lesson;
import com.neu.po.LessonAndAddress;



public interface FrontLessonService {
	public Map<String, List<Lesson>> findLessonListByCategory() throws Exception;
	public LessonAndAddress findLessonAndAddressById(int lid) throws Exception;
	
}
