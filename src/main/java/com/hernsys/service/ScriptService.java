package com.hernsys.service;

public class ScriptService {

	private static final ScriptService INSTANCE = new ScriptService();

	public static ScriptService getInstance() {
		return INSTANCE;
	}

	public void helloWorld(String name) {
		System.out.println("Hello " + name);
	}

}
