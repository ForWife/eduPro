package com.neu.service.impl;

import com.neu.beans.Enterprise;
import com.neu.mapper.BackCompanyMapper;
import com.neu.service.BackCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BackCompanyServiceImpl implements BackCompanyService {
    @Autowired
    BackCompanyMapper companyMapper;

    @Override
    public Enterprise findCompanyByQid(int qid) {
        try {
            return companyMapper.findCompanyByQid(qid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

	@Override
	public boolean editCompany(Enterprise enterprise) {
		// TODO Auto-generated method stub
		try {
			return companyMapper.editCompany(enterprise)>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
