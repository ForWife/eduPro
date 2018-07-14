
package com.neu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.Swiper;
import com.neu.mapper.FrontHomeMapper;
import com.neu.service.FrontHomeService;

@Service
public class FrontHomeServiceBean implements FrontHomeService {

	@Autowired
	FrontHomeMapper frontHomeMapper;
	
	@Override
	public List<Swiper> getHomeImg(int qid) throws Exception {
		System.out.println(".......>FrontHomeService.....>getHomeImg");
		List<Swiper> list = frontHomeMapper.getHomeImg(qid);
		return list;
	}

}

