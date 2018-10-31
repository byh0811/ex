package com.itplanet.resam.dao;

import java.util.*;

import com.itplanet.resam.dto.*;

public interface BoardDao {
	public List<SampleBoard> listBoard(SampleBoard sBoard);
	
	public SampleBoard getBoard(SampleBoard sBoard);
	
	public int insertBoard(SampleBoard sBoard);
	
	public int updateBoard(SampleBoard sBoard);
	
	public int deleteBoard(SampleBoard sBoard);
}
