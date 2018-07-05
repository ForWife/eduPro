package com.neu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.BackDeleteMessageMapper;
import com.neu.service.BackDeleteMessageService;
@Service
public class BackDeleteMessageServiceImpl implements BackDeleteMessageService {
	@Autowired
	private BackDeleteMessageMapper backDeleteMessageMapper;

	@Override
	public int deleteMessage(int mid,int imgNumber, int likeNumber, int replyNumber) throws Exception {
		int flag = 1;
		backDeleteMessageMapper.deleteMessage(mid);
		if(backDeleteMessageMapper.deleteMessageImg(mid) != imgNumber) {
			flag = 0;
		}
		if(backDeleteMessageMapper.deleteMessageLike(mid) != likeNumber) {
			flag = 0;
		}
		if(backDeleteMessageMapper.deleteMessageReply(mid) != replyNumber) {
			flag = 0;
		}
		System.out.println(flag);
		return flag;
	}

}
