package com.neu.service;

import java.util.List;

import com.neu.beans.FreeListen;
import com.neu.beans.Lesson;
import com.neu.beans.Swiper;

public interface FrontHomeService {
//	�����ͼƬ
	public List<Swiper> getHomeImg(int qid) throws Exception;
	
//	������µ����ſγ�
	public List<Lesson> getTwoLesson(int qid) throws Exception;
//	�������������
	public List<FreeListen> getTwoFreeListen(int qid) throws Exception;
}
