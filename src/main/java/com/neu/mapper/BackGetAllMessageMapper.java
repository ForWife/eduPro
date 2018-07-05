package com.neu.mapper;

import java.util.List;

import com.neu.beans.Message;

public interface BackGetAllMessageMapper {
	public List<Message> getAllMessage(int qid) throws Exception;
}
