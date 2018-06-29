package com.neu.mapper;

import com.neu.beans.Enterprise;

import java.sql.SQLException;

public interface BackCompanyMapper {
    public Enterprise findCompanyByQid(int qid) throws SQLException;
}
