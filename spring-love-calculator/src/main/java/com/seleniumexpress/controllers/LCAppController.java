package com.seleniumexpress.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seleniumexpress.lc.api.UserInfoDTO;

@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String showHomepage() {
		return "home-page";
	}
    
	@RequestMapping("/process-homepage")
	public String showResultPage(UserInfoDTO userInfoDTO,Model model) {
		 
		System.out.println("user name is " + userInfoDTO.getUserName());
		System.out.println("user name is " + userInfoDTO.getCrushName());
		//model.addAttribute("userName", userName1);
		//model.addAttribute("crushName", crushName1);
		
		return "result-page";
		
	}

}
