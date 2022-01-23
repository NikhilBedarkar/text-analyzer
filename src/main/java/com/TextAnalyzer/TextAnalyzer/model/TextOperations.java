package com.TextAnalyzer.TextAnalyzer.model;

import org.springframework.stereotype.Component;

@Component
public class TextOperations {
	
	public long countLetters(String text) {
		return text.length();
	}

	public long countWords(String text) {
		return text.split(" ").length;
	}
}
