package com.itplanet.resam.dao;

import java.util.*;

public interface AbstractDao {
	/**
	 * db select
	 * @param queryId
	 * @param object
	 * @return
	 */
	public Object select(String queryId, Object object);
	
	/**
	 * db selectList
	 * @param queryId
	 * @param object
	 * @return
	 */
	public List<?> list(String queryId, Object object);
	
	/**
	 * db selectList
	 * @param queryId
	 * @return
	 */
	public List<?> list(String queryId);
	
	/**
	 * db insert
	 * @param queryId
	 * @param object
	 */
	public int insert(String queryId, Object object);
	
	/**
	 * db update
	 * @param queryId
	 * @param object
	 * @return
	 */
	public int update(String queryId, Object object);
	
	/**
	 * db delete
	 * @param queryId
	 * @param object
	 * @return
	 */
	public int delete(String queryId, Object object);
}
