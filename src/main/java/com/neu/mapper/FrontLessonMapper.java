package com.neu.mapper;

import java.util.List;

import com.neu.beans.Lesson;



public interface FrontLessonMapper {
	public List<String> findTypeList() throws Exception;
	public List<Lesson> findLessehByCategory(String category);
	public Lesson getLesssonById(int lid);
}
