package com.itplanet.resam.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.scripting.bsh.BshScriptUtils.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.itplanet.resam.dto.*;
import com.itplanet.resam.service.*;

import lombok.Builder.*;

@Controller
public class BoardController {
	@Autowired
	private BoardService bService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView sampleList(SampleBoard sb, @RequestParam(defaultValue="1") int page) {
		ModelAndView mv = new ModelAndView("/board");
		mv.addObject("map",bService.boardList(sb));
		return mv;
	}
	
	@RequestMapping(value="/detail", method= RequestMethod.GET)
	public ModelAndView sampleDetail(SampleBoard sb) {
		ModelAndView mv = new ModelAndView("/detail");
		mv.addObject("board", bService.getBoard(sb));
		return mv;
	}
	
	@RequestMapping(value="/write", method= RequestMethod.GET)
	public String sampleWrite() {
		return "/input";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String sampleWrite(SampleBoard sb) {
		bService.insertBoard(sb);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.GET)
	public ModelAndView sampleModify(int boardIdx) {
		SampleBoard sb = new SampleBoard();
		sb.setBoardIdx(""+boardIdx);
		ModelAndView mv = new ModelAndView("/modify");
		mv.addObject("board", bService.getBoard(sb));
		return mv;
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String sampleModify(SampleBoard sb) {
		bService.updateBoard(sb);
		return "redirect:/list";
	}
	
	public String sampleDelete(SampleBoard sb) {
		bService.deleteBoard(sb);
		return "redirect:/list";
	}
}
