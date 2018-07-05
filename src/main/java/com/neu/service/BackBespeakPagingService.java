package com.neu.service;

import com.neu.po.Bespeak;

public interface BackBespeakPagingService {
	public Bespeak getBespeakPaging(int id , int begin, int number) throws Exception;
}
