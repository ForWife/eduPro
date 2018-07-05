package com.neu.mapper;

import java.util.List;
import java.util.Map;

import com.neu.beans.Address;
import com.neu.beans.Lesson;
import com.neu.beans.SOrder;

public interface FrontOrderMapper {
	public List<SOrder> getOrderByStatus(Map<String, Object> map) throws Exception;
	public Lesson getLesssonById(int lid) throws Exception;
	public Address getLessonAdderss(int lid) throws Exception;
}
