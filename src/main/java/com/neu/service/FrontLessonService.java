package com.neu.service;

import java.util.List;
import java.util.Map;


import com.neu.beans.Lesson;
import com.neu.po.AddressandLesson;
import com.neu.po.FreeListenByAddress;
import com.neu.po.LessonAndAddress;



public interface FrontLessonService {
	public Map<String, List<Lesson>> findLessonListByCategory() throws Exception;
	public LessonAndAddress findLessonAndAddressById(Integer lid, Integer branchid) throws Exception;
	
//	按照地址显示课程
	public List<AddressandLesson> findLessonsByAddress(int qid) throws Exception;

//	试听课，按地址显示
	public List<FreeListenByAddress> findFreeListens(int qid) throws Exception;
}
