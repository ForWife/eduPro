package com.neu.service;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neu.beans.FreeListen;

public interface BackGetFreeListenBookService {
	public List<FreeListen> getfreeListenBook(int pageStart, int pageNumber) throws Exception;
	public int getPageNumber() throws Exception;
	public List<FreeListen> getfreeListenBookByeInput(int pageStart, int pageNumber, String titleKey, String listenState, String listenStartTime, String listenEndTime) throws Exception;
}
