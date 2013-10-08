package com.hernsys.service;

public class Step2Service {

	private static final Step2Service INSTANCE = new Step2Service();

	public static Step2Service getInstance() {
		return INSTANCE;
	}

	public void helloWorld(String name) {
		System.out.println("Hello " + name);
	}

}
