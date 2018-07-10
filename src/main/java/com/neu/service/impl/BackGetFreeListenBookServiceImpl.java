package com.neu.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.FreeListen;
import com.neu.mapper.BackGetFreeListenBookMapper;
import com.neu.service.BackGetFreeListenBookService;
@Service
public class BackGetFreeListenBookServiceImpl implements BackGetFreeListenBookService {
	@Autowired
	private BackGetFreeListenBookMapper backGetFreeListenBookMapper;

	@Override
	public List<FreeListen> getfreeListenBook(int pageStart, int pageNumber) throws Exception{
		// TODO Auto-generated method stub
		return backGetFreeListenBookMapper.getfreeListenBook(pageStart, pageNumber);
	}

	@Override
	public int getPageNumber() throws Exception {
		// TODO Auto-generated method stub
		
		return backGetFreeListenBookMapper.getPageNumber();
	}

	@Override
	public List<FreeListen> getfreeListenBookByeInput(int pageStart, int pageNumber, String titleKey, String listenState, String listenStartTime, String listenEndTime) throws Exception {
		// TODO Auto-generated method stub
		return backGetFreeListenBookMapper.getfreeListenBookByeInput(pageStart, pageNumber, titleKey, listenState, listenStartTime, listenEndTime);
	}
	
	
}
