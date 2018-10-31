package com.itplanet.resam.dao;

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
	public Object list(String queryId, Object object);
	
	/**
	 * db selectList
	 * @param queryId
	 * @return
	 */
	public Object list(String queryId);
	
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
