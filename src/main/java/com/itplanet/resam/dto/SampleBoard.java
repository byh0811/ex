package com.itplanet.resam.dto;

import lombok.*;

@Data
public class SampleBoard {
	private String boardIdx			= null;
	private String boardWriter		= null;
	private String boardTitle		= null;
	private String boardContents	= null;
	private String boardParent		= null;
	private String boardSeq			= null;
	private String boardViewCount	= null;
	private String fileIdx			= null;
	
	private int offset				= 0;
	private int row					= 0;
	private int sortNumber			= 0;
}
