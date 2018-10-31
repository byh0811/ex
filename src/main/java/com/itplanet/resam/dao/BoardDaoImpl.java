package com.itplanet.resam.dao;

import java.util.*;

import com.itplanet.resam.dto.*;

public class BoardDaoImpl extends AbstractDaoImpl implements BoardDao{

	@SuppressWarnings("unchecked")
	public List<SampleBoard> listBoard(SampleBoard sBoard) {
		return (List<SampleBoard>) list("selectBoard", sBoard);
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
