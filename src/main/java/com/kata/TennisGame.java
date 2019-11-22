package com.kata;

import com.kata.util.Points;
import com.kata.util.Score;

/**
 * 
 * Description : This class contain logic for Tennis Game
 *
 */
public class TennisGame {

	public String getScore(Player playerOne, Player playerTwo) {
		int playerOneScore = playerOne.getScore();
		int playerTwoScore = playerTwo.getScore();

		if (isWins(playerOneScore, playerTwoScore)) {
			if (playerOneScore > playerTwoScore) {
				return playerOne.getName() + Score.WINS.value;
			} else {
				return playerTwo.getName() + Score.WINS.value;
			}
		}

		if (isAdvantage(playerOneScore, playerTwoScore)) {
			if (playerOneScore > playerTwoScore) {
				return playerOne.getName() + Score.ADVANTAGE.value;
			} else {
				return playerTwo.getName() + Score.ADVANTAGE.value;
			}
		}

		if (isDeuce(playerOneScore, playerTwoScore)) {
			return Score.DEUCE.value;
		}

		if (isAll(playerOneScore, playerTwoScore)) {
			return Points.get(playerOne.getScore()) + Score.ALL.value;
		}
		return Points.get(playerOne.getScore()) + "," + Points.get(playerTwoScore);
	}

	private boolean isWins(int playerOneScore, int playerTwoScore) {
		if (playerOneScore >= 4 && playerTwoScore == playerOneScore - 2) {
			return true;
		}
		if (playerTwoScore >= 4 && playerOneScore == playerTwoScore - 2) {
			return true;
		}
		return false;
	}

	private boolean isAdvantage(int playerOneScore, int playerTwoScore) {
		if (playerOneScore > playerTwoScore && playerTwoScore >= 3) {
			return true;
		}
		if (playerOneScore < playerTwoScore && playerOneScore >= 3) {
			return true;
		}
		return false;
	}

	private boolean isDeuce(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore >= 3) {
			return true;
		}
		return false;
	}

	private boolean isAll(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore <= 3) {
			return true;
		}

		return false;
	}

}