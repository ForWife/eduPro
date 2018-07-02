package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.beans.Lesson;



public interface FrontLessonService {
	public Map<String, List<Lesson>> findLessonListByCategory() throws Exception;
	public Lesson findLessonById(int lid);
}
