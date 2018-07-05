package com.neu.service;

import com.neu.beans.FreeListen;

import java.util.List;

public interface BackTrialService {
    public List<FreeListen> findtrial(int qid);

    public FreeListen fintrialbyid(int id);

    public boolean deleteTrial(int id);

    public boolean addTrial(FreeListen freeListen);

    public boolean editTrial(FreeListen freeListen);
}
