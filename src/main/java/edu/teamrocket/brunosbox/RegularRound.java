package edu.teamrocket.brunosbox;

public class RegularRound implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        boxerRoundScore();
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public void boxerRoundScore() {
        String[] scores = roundScore.split("-", 2);
        this.redBoxerScore = Byte.parseByte(scores[0]);
        this.blueBoxerScore = Byte.parseByte(scores[1]);
    }

    @Override
    public String toString() {
        return getRedBoxerScore()+ " - " + getBlueBoxerScore();
    }

    }


