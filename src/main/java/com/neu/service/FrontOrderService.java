package com.neu.service;

import java.util.List;

import com.neu.po.OrderAbout;

public interface FrontOrderService {
	List<OrderAbout> getOrderAbouts(String status ,String openid) throws Exception;
}
