package com.itplanet.resam.dao;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;

public class AbstractDaoImpl implements AbstractDao{
	@Autowired
	private SqlSessionTemplate tpl;

	public Object select(String queryId, Object object) {
		return tpl.selectOne(queryId, object);
	}

	public Object list(String queryId, Object object) {
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

	public Object list(String queryId) {
		return null;
	}

}
