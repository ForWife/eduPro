package com.neu.service;

import com.neu.beans.Enterprise;

public interface BackCompanyService {
    public Enterprise findCompanyByQid(int qid);
    public boolean editCompany(Enterprise enterprise);
}
