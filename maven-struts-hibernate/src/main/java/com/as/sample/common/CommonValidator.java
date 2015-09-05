package com.as.sample.common;

public class CommonValidator {
	public static boolean isFieldBlank(String fieldValue) {
		// TODO Auto-generated method stub
		return fieldValue == null || fieldValue.trim().length() == 0;
	}
}
