package com.neu.service;

import java.util.List;

import com.neu.po.MessageAbout;

public interface FrontCircleOfFriendsService {
	public List<MessageAbout> getMessageAbout(int qid) throws Exception;
}
