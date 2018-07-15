package com.neu.mapper;

import java.util.List;

import com.neu.beans.Address;
import com.neu.beans.FreeListen;
import com.neu.beans.Lesson;



public interface FrontLessonMapper {
//	按照课程类别划分
	public List<String> findTypeList() throws Exception;
	public List<Lesson> findLessehByCategory(String category)throws Exception;
	public Lesson getLesssonById(int lid) throws Exception;
	public List<Address> getLessonAdderss(int lid) throws Exception;
	
//	按照分部来划分
	public List<Address> findAddresList(int qid) throws Exception;
	public List<Lesson> findLessonsByAddress(int branchid) throws Exception;
	
//	获取课程地址
	public Address getAddress(int branchid) throws Exception;
	
//	试听课列表，按照类别分
	public List<FreeListen> getFreeListenListByAddress(int branchid) throws Exception;
}
