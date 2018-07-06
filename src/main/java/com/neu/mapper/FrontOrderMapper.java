
package com.neu.mapper;

import com.neu.beans.Address;
import com.neu.beans.Lesson;
import com.neu.beans.SOrder;
import java.util.List;

import com.neu.po.OrderVO;

public interface FrontOrderMapper {

	List<OrderVO> findAllorder() throws Exception;
	public List<SOrder> getOrderByStatus(String s) throws Exception;
	public Lesson getLesssonById(int lid) throws Exception;
	public Address getLessonAdderss(int lid) throws Exception;
}





