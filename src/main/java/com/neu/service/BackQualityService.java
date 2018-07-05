package com.neu.service;

import com.neu.beans.Lesson;

import java.util.List;

public interface BackQualityService {
    public List<Lesson> findQuanlity(int qid);
    public boolean deleteQuanlity(int lid);
    public Lesson finQualityById(int lid);

    public List<String> findCategory(int qid);

    public boolean addQuality(Lesson lesson);

    public boolean editQuality(Lesson lesson);
}
