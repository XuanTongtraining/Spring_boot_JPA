package com.laptrinhjavaweb.customException;

public class FieldNotFoundExcetion extends RuntimeException{
	public FieldNotFoundExcetion(String str) {
		super(str);
	}

}
