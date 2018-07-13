package com.neu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neu.beans.Address;
import com.neu.beans.Message;

public interface BackGetAllMessageMapper {
	public List<Message> getAllMessage(int qid) throws Exception;
	public List<Address> getPart(@Param("qid") int qid) throws Exception;
}
