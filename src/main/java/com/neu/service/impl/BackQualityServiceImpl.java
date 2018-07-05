package com.neu.service.impl;

import com.neu.beans.Lesson;
import com.neu.mapper.BackQualityMapper;
import com.neu.service.BackQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BackQualityServiceImpl implements BackQualityService {
    @Autowired
    BackQualityMapper qualityMapper;

    @Override
    public List<Lesson> findQuanlity(int qid) {
        try {
            return qualityMapper.findQuality(qid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteQuanlity(int lid) {
        try {
            return qualityMapper.deleteQuality(lid) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Lesson finQualityById(int lid) {
        try {
            return qualityMapper.finQualityById(lid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<String> findCategory(int qid) {
        try {
            return qualityMapper.findCategory(qid);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean addQuality(Lesson lesson) {
        try {
            return qualityMapper.addQuality(lesson) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean editQuality(Lesson lesson) {
        try {
            return qualityMapper.editQuality(lesson) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
