package com.neu.service.impl;

import com.neu.beans.Address;
import com.neu.mapper.BackBranchMapper;
import com.neu.service.BackBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BackBranchServiceImpl implements BackBranchService {
    @Autowired
    BackBranchMapper backBranchMapper;

    @Override
    public List<Address> findBranches(int qid) {
        try {
            return backBranchMapper.findBranches(qid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Address findBranch(int id) {
        try {
            return backBranchMapper.findBranchById(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
