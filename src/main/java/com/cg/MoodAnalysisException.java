package com.cg;

public class MoodAnalysisException extends Exception {
	enum ExceptionType {
		ENTERED_EMPTY, ENTERED_NULL
	}

	ExceptionType type;

	public MoodAnalysisException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
