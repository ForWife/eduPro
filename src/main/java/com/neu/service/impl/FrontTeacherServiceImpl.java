package com.neu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.neu.beans.Enterprise;
import com.neu.beans.Teacher;
import com.neu.mapper.FrontTeacherMapper;
import com.neu.service.FrontTeacherService;
import com.neu.util.RedisConnectionPoor;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Service
public class FrontTeacherServiceImpl implements FrontTeacherService {

	@Autowired
	FrontTeacherMapper mapper;
	
//	依赖注入
	@Autowired
	private JedisPool jedisPool;

	
	@Override
	public List<Teacher> findTeacher(int qid) throws Exception{
		System.out.println("...Service...findTeacher().....");
		Class<Teacher> type = null;
		List<Teacher> list=new ArrayList<Teacher>();	
//		Jedis jedis = RedisConnectionPoor.getJedis();
		Gson gson = new Gson();
		Jedis jedis = jedisPool.getResource();
		String tList = jedis.get("teacher"+qid);
		if(tList==null){
			String teachers = gson.toJson(mapper.getallteacher(qid));
			jedis.set("teacher"+qid, teachers);
			JsonArray jsonarray = new JsonParser().parse(jedis.get("teacher"+qid)).getAsJsonArray();
			System.out.println("0");
			for (JsonElement jsonElement : jsonarray) {
				System.out.println("1");
				list.add(gson.fromJson(jsonElement, type));
			}
		}else{
			System.out.println("2");
			JsonArray jsonarray = new JsonParser().parse(jedis.get("teacher"+qid)).getAsJsonArray();
			for (JsonElement jsonElement : jsonarray) {
				list.add(gson.fromJson(jsonElement, type));
				}
		}
//		list = mapper.getallteacher(qid);
		return list;
	}
}
