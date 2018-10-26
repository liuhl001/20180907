package com.yuny.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SampleController {
	    @RequestMapping("/")
	    String home(ModelMap map) {
	      //  return "Hello World!";
	    	map.addAttribute("id", "11");
	    	map.addAttribute("name", "六号");
	    	return "detail";
	    }
}

