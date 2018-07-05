package com.neu.mapper;

import com.neu.beans.FreeListen;

import java.sql.SQLException;
import java.util.List;

public interface BackTrialMapper {
    public List<FreeListen> findTrial(int qid) throws SQLException;

    public FreeListen findTrialById(int id) throws SQLException;

    public int deleteTrial(int id) throws SQLException;

    public int addTrial(FreeListen freeListen) throws SQLException;

    public int editTrial(FreeListen freeListen) throws SQLException;
}
