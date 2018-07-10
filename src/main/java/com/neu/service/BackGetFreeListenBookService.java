package com.neu.service;

import java.util.List;


import com.neu.beans.FreeListen;

public interface BackGetFreeListenBookService {
	public List<FreeListen> getfreeListenBook(int pageStart, int pageNumber) throws Exception;
	public int getPageNumber() throws Exception;
	public List<FreeListen> getfreeListenBookByeInput(int pageStart, int pageNumber, String titleKey, String listenState, String listenStartTime, String listenEndTime) throws Exception;
	public void setState(int book_id) throws Exception;
}
