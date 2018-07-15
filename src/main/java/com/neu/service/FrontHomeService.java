package com.neu.service;

import java.util.List;

import com.neu.beans.FreeListen;
import com.neu.beans.Lesson;
import com.neu.beans.Swiper;

public interface FrontHomeService {
//	获得轮图片
	public List<Swiper> getHomeImg(int qid) throws Exception;
	
//	获得最新的两门课程
	public List<Lesson> getTwoLesson(int qid) throws Exception;
//	获得两门试听课
	public List<FreeListen> getTwoFreeListen(int qid) throws Exception;
}
