package com.itplanet.resam.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.itplanet.resam.service.*;

@Controller
public class BoardController {
	@Autowired
	private BoardService bService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView sampleList() {
		ModelAndView mv = new ModelAndView("/board");
		mv.addObject("map",bService.boardList());
		return mv;
	}
}
