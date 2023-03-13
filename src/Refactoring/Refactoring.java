package Refactoring;

public class Refactoring {
    public static final String ADVANTAGE = "Advantage for ";

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String DEUCE = "Deuce";

    public static String getScore(int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        if (firstPlayerScore == secondPlayerScore) {
            if (firstPlayerScore < 4) {
                score = getScoreString(firstPlayerScore) + "_ALL";
            } else {
                score = DEUCE;
            }
        } else if (firstPlayerScore > 3 || secondPlayerScore > 3) {
            int minusScore = firstPlayerScore - secondPlayerScore;
            if (Math.abs(minusScore) == 1) {
                score = ADVANTAGE + ((minusScore > 0) ? "Player 1" : "Player 2");
            } else {
                score = ((minusScore > 0) ? "Player 1" : "Player 2") + "Win!";
            }
        } else {
            score = getScoreString(firstPlayerScore) + " - " + getScoreString(secondPlayerScore);
        }
        return score;
    }


    private static String getScoreString(int score) {
        String scoreToString = "";
        switch (score) {
            case 0:
                scoreToString = LOVE;
                break;
            case 1:
                scoreToString = FIFTEEN;
                break;
            case 2:
                scoreToString = THIRTY;
                break;
            case 3:
                scoreToString = FORTY;
                break;
            default:
                break;
        }
        return scoreToString;
    }
}
