package com.itplanet.resam.service;

import java.util.*;

import com.itplanet.resam.dto.*;


public interface BoardService {
	
	public Map<String, Object> boardList(SampleBoard sb);
	
	public SampleBoard getBoard(SampleBoard sb);
	
	public int insertBoard(SampleBoard sb);
	
	public int updateBoard(SampleBoard sb);
	
	public int deleteBoard(SampleBoard sb);
}
