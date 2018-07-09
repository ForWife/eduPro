package com.neu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neu.beans.FreeListen;

public interface BackGetFreeListenBookMapper {
	public List<FreeListen> getfreeListenBook(@Param("pageStart") int pageStart, @Param("pageNumber") int pageNumber) throws Exception;
	public int getPageNumber() throws Exception;
}
