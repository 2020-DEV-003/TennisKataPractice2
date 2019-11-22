package com.kata.util;

public enum Score {

	ADVANTAGE(" Advantage"), WINS(" Wins"), DEUCE("Deuce"), ALL(" All");

	public final String value;

	private Score(String value) {
		this.value = value;
	}

}
