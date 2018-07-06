package com.neu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.Address;
import com.neu.beans.Message;
import com.neu.beans.MessageImg;
import com.neu.beans.MessageLike;
import com.neu.beans.MessageReply;
import com.neu.mapper.FrontCircleOfFriendsMapper;
import com.neu.po.MessageAbout;
import com.neu.service.FrontCircleOfFriendsService;

@Service
public class FrontCircleOfFriendsServiceBean implements FrontCircleOfFriendsService {

	@Autowired
	FrontCircleOfFriendsMapper circleOfFriendsMapper;
	
	@Override
	public List<MessageAbout> getMessageAbout(int qid) throws Exception {
		List<MessageAbout> messageAboutList = new ArrayList<>();
		List<Message> messageList;
		messageList = circleOfFriendsMapper.getMessageById(qid);
		for(Message message:messageList){
			MessageAbout messageAbout = new MessageAbout();
			List<MessageImg> imglist = circleOfFriendsMapper.getMessageImg(message.getMid());
			List<MessageLike> likelist = circleOfFriendsMapper.getMessageLike(message.getMid());
			List<MessageReply> replylist = circleOfFriendsMapper.getMessageReply(message.getMid());
			Address address = circleOfFriendsMapper.getBranchAddress(message.getBranchid());
			messageAbout.setAddress(address);
			messageAbout.setMessage(message);
			messageAbout.setMessageImg(imglist);
			messageAbout.setMessageLike(likelist);
			messageAbout.setMessageReply(replylist);
			messageAboutList.add(messageAbout);
		}
		return messageAboutList;
	}
}
