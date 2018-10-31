package com.itplanet.resam.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.support.*;
import org.springframework.stereotype.*;

import com.itplanet.resam.dao.*;
import com.itplanet.resam.dto.*;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao dao;
	public Map<String, Object> boardList(SampleBoard sb) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list",dao.listBoard(sb));
		//페이징
		return map;
	}

	public SampleBoard getBoard(SampleBoard sb) {
		return dao.getBoard(sb);
	}

	public int insertBoard(SampleBoard sb) {
		return dao.insertBoard(sb);
	}

	public int updateBoard(SampleBoard sb) {
		return dao.updateBoard(sb);
	}

	public int deleteBoard(SampleBoard sb) {
		return dao.deleteBoard(sb);
	}

}
