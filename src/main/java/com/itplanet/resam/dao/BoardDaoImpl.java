package com.itplanet.resam.dao;

import java.util.*;

import org.springframework.stereotype.*;

import com.itplanet.resam.dto.*;

@Repository
public class BoardDaoImpl extends AbstractDaoImpl implements BoardDao{

	public List<SampleBoard> listBoard(SampleBoard sBoard) {
		List<SampleBoard> out = (List<SampleBoard>) list("selectBoard", sBoard);
		System.out.println(out);
		return out;
	}

	public SampleBoard getBoard(SampleBoard sBoard) {
		return (SampleBoard) select("selectBoard", sBoard);
	}

	public int insertBoard(SampleBoard sBoard) {
		return insert("insertBoard", sBoard);
	}

	public int updateBoard(SampleBoard sBoard) {
		return update("updateBoard", sBoard);
	}

	public int deleteBoard(SampleBoard sBoard) {
		return delete("deleteBoard", sBoard);
	}

}
