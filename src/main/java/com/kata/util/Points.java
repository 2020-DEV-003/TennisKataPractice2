package com.kata.util;

import java.util.HashMap;
import java.util.Map;

public enum Points {

	LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3);

	private static final Map<Integer, Points> LOOKUP = new HashMap();

	static {
		for (Points pointsEnum : Points.values())
			LOOKUP.put(pointsEnum.getPoints(), pointsEnum);
	}

	private Points(final int points) {
		this.points = points;
	}

	private int points;

	public int getPoints() {
		return points;
	}

	public static Points get(int points) {
		return LOOKUP.get(points);
	}

}