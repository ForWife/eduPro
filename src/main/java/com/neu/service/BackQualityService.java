package com.neu.service;

import com.neu.beans.Lesson;
import com.neu.beans.LessonBranch;

import java.util.List;

public interface BackQualityService {
    public List<Lesson> findQuanlity(int qid);
    public boolean deleteQuanlity(int lid);
    public Lesson finQualityById(int lid);

    public boolean addlessonbranch(LessonBranch lessonBranch);
    public List<Integer> findBranchIds(int lid);
    public List<String> findCategory(int qid);

    public boolean deletelessonbranch(int lid);

    public List<String> findBranchNames(int lid);

    public int addQuality(Lesson lesson);

    public boolean editQuality(Lesson lesson);
}
