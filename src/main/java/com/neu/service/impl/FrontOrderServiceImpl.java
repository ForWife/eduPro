package com.neu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.FrontOrderMapper;
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


}
