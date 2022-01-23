package com.TextAnalyzer.TextAnalyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.TextAnalyzer.TextAnalyzer.model.TextOperations;

@RestController
public class TextController {

	@Autowired
	public TextOperations obj;
	
	@GetMapping("/")
	public ModelAndView showLoginPage(Model model) {
		model.addAttribute("message", "Welcome to Spring Boot Tutorials!");
		return new ModelAndView("welcomePage");
	}
	
	@ResponseBody
	@GetMapping(path="hello")
	public String sayhello() {
		return "Hello";
	}
	
	@GetMapping(path="getWords")
	public long getWordCount(@RequestBody String text) {
		return obj.countWords(text);
	}
}
