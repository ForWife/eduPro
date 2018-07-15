package com.neu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.beans.Enterprise;
import com.neu.beans.Teacher;
import com.neu.mapper.FrontTeacherMapper;
import com.neu.service.FrontTeacherService;
@Service
public class FrontTeacherServiceImpl implements FrontTeacherService {

	@Autowired
	FrontTeacherMapper mapper;

	@Override
	public List<Teacher> findTeacher(int qid) {
		System.out.println("...Service...findTeacher().....");
		List<Teacher> list=new ArrayList<Teacher>();		
		try {
			list=mapper.getallteacher(qid);
		} catch (Exception e) {
			list=null;
			e.printStackTrace();
		}
		return list;
	}
}
