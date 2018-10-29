package com.itplanet.resam.dto;

import lombok.*;

@Data
public class SampleBoard {
	private String boardIdx;
	private String boardWriter;
	private String boardTitle;
	private String boardContents;
	private String boardParent;
	private String boardSeq;
	private String boardViewCount;
	private String fileIdx;
}
