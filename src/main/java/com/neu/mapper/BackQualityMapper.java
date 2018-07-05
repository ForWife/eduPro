package com.neu.mapper;

import com.neu.beans.Lesson;

import java.sql.SQLException;
import java.util.List;

public interface BackQualityMapper {
    public List<Lesson> findQuality(int qid) throws SQLException;

    public int deleteQuality(int lid) throws SQLException;

    public Lesson finQualityById(int lid) throws SQLException;
}
