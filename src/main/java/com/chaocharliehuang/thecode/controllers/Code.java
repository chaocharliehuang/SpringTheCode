package com.chaocharliehuang.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("/")
public class Code {
	
	@GetMapping("")
	public String index(@ModelAttribute("errors") String errors, Model model) {
		model.addAttribute("errors", errors);
		return "index";
	}
	
	@PostMapping("process")
	public String process(
			@RequestParam(value="code") String code, 
			RedirectAttributes redirectAttributes) {
		if (code.equals("bushido")) {
			return "code";
		} else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@GetMapping("code")
	public String code() {
		return "code";
	}
}
