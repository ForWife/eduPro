package com.neu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.FrontOrderMapper;
import com.neu.po.OrderAbout;
import com.neu.po.OrderVO;
import com.neu.service.FrontOrderService;

@Service
public class FrontOrderServiceImpl implements FrontOrderService {

	@Autowired
    FrontOrderMapper mapper;
	
	@Override
	public List<OrderVO> findAllorder() {
		System.out.println("...Service...findAllorder().....");
		List<OrderVO> list=null;
		try {
			list=mapper.findAllorder();
		} catch (Exception e) {
			list=null;
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public List<OrderAbout> getOrderAbouts(String openid) throws Exception {
//
//		Map<String, Object> map = new HashMap<>();
//		map.put("status", status);
//		map.put("openid", openid);
		List<OrderAbout> lists = new ArrayList<OrderAbout>();
//		List<SOrder> orderList = orderMapper.getOrderByStatus(map);
//		for (SOrder sOrder : orderList) {
//			OrderAbout orderAbout = new OrderAbout();
//			Lesson lesson = orderMapper.getLesssonById(sOrder.getLid());
//			Address address = orderMapper.getLessonAdderss(sOrder.getLid());
//			orderAbout.setAddress(address);
//			orderAbout.setLesson(lesson);
//			orderAbout.setOrder(sOrder);
//			lists.add(orderAbout);
//		}
// 		
		return lists;
	}

	

}
