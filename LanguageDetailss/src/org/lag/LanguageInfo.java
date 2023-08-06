package org.lag;

public class LanguageInfo extends StateDetails {
	
	public void tamilLanguage() {
		
	System.out.println("Tamil Language");
	
	}
	public void englishLanguage() {
		
		System.out.println("English Language");
		
	}
	public void hindilanguage() {
		
		System.out.println("Hindi Language");
		
	}
	public static void main(String[] args) {
		LanguageInfo info = new LanguageInfo();
		info.hindilanguage();
		info.northIndia();
		info.tamilLanguage();
		info.englishLanguage();
		info.southIndia();
		
		
	}

}
