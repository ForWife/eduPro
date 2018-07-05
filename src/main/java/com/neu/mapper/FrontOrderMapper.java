package com.neu.mapper;

import java.util.List;

import com.neu.po.OrderVO;

public interface FrontOrderMapper {

	List<OrderVO> findAllorder() throws Exception;

}
