package com.neu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neu.beans.FreeListen;
import com.neu.beans.FreeListenBook;

public interface BackBespeakPagingMapper {
	public List<FreeListen> getFreelisten() throws Exception;
	public List<FreeListenBook> getFreeListenBook(@Param("id") int id, @Param("begin") int begin, @Param("number") int number) throws Exception;
}
