package com.neu.mapper;

import java.util.List;

import com.neu.po.Lesson;

public interface FrontLessonMapper {
	public List<String> findTypeList() throws Exception;
	public List<Lesson> findLessehByCategory(String catigory);
}
