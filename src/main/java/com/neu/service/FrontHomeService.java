package com.neu.service;

import java.util.List;

import com.neu.beans.Swiper;

public interface FrontHomeService {
	public List<Swiper> getHomeImg(int qid) throws Exception;
	
}
