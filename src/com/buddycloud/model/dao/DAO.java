package com.buddycloud.model.dao;

import java.util.Map;

import org.json.JSONObject;

public interface DAO<Set, Get> {
	
	public boolean insert(String channel, Set json);
	
	public boolean update(String channel, JSONObject json);
	
	public Get get(String channel);
	
	public Map<String, Get> getAll();
}
