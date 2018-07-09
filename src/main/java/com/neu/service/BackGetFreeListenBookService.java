package com.neu.service;

import java.util.List;

import com.neu.beans.FreeListen;

public interface BackGetFreeListenBookService {
	public List<FreeListen> getfreeListenBook(int pageStart, int pageNumber) throws Exception;
	public int getPageNumber() throws Exception;
}
