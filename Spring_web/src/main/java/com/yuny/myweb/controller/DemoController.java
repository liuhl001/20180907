package com.yuny.myweb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yuny.myweb.model.Menu;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

	  @RequestMapping("/demo")
	    public String demo() {
		  
	        return "index";
	    }
	 


}
