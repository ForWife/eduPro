package com.neu.mapper;

import com.neu.beans.Lesson;

import java.util.List;

public interface FrontLessonMapper {
	public List<String> findTypeList() throws Exception;
	public List<Lesson> findLessehByCategory(String catigory);
}
