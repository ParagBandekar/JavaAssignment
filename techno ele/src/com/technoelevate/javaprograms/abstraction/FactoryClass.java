package com.technoelevate.javaprograms.abstraction;

public class FactoryClass {
Browser browser=null;
public Browser getBrowser(String name) {
	if(name.equalsIgnoreCase("Chrome")) {
		browser =new Chrome();
	}else if (name.equalsIgnoreCase("Safari")) {
		browser =new Mozilla();
	}else {
		browser=new Opera();
	}
	return browser;
}
}
