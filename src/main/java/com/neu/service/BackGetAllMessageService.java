package com.neu.service;

import java.util.List;

import com.neu.beans.Message;

public interface BackGetAllMessageService {
	public List<Message> getAllMessage(int qid) throws Exception;
}