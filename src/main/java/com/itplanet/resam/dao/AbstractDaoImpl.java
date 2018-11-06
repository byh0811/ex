package com.itplanet.resam.dao;

import java.util.*;

import org.apache.log4j.*;
import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;

public class AbstractDaoImpl implements AbstractDao{
	private Logger logger = Logger.getLogger(this.getClass());
	@Autowired
	private SqlSessionTemplate tpl;

	public Object select(String queryId, Object object) {
		return tpl.selectOne(queryId, object);
	}

	public List<?> list(String queryId, Object object) {
		if (logger.isDebugEnabled()) {
			logger.debug(new Exception().getStackTrace()[0].getMethodName()
					+ "() QueryId:" + queryId
					+ " Pararm:" + object.toString()
					);
		}
		if(object==null) return tpl.selectList(queryId);
		return tpl.selectList(queryId, object);
	}

	public int insert(String queryId, Object object) {
		return tpl.insert(queryId, object);
	}

	public int update(String queryId, Object object) {
		return tpl.update(queryId,object);
	}

	public int delete(String queryId, Object object) {
		return tpl.delete(queryId, object);
	}

	public List<?> list(String queryId) {
		return tpl.selectList(queryId);
	}

}
