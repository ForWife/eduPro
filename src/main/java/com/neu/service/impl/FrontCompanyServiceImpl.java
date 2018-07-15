package com.neu.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neu.beans.Enterprise;
import com.neu.mapper.FrontCompanyMapper;
import com.neu.service.FrontCompanyService;
@Service
public class FrontCompanyServiceImpl implements FrontCompanyService {

	@Autowired
	FrontCompanyMapper  mapper;
	@Override
	public Enterprise findEnterprise(int qid) {
		System.out.println("...Service...findEnterprise().....");
		Enterprise enterprise;		
		try {
			enterprise=mapper.getenterprise(qid);
		} catch (Exception e) {
			enterprise=null;
			e.printStackTrace();
		}
		return enterprise;
		
	}

}
