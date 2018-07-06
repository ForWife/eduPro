
package com.neu.service;

import java.util.List;

import com.neu.po.OrderVO;
import com.neu.po.OrderAbout;

public interface FrontOrderService {

	public List<OrderVO> findAllorder();
	public List<OrderAbout> getOrderAbouts(String openid) throws Exception;
}




