package edu.teamrocket.brunosbox;

public class PointsDeducted implements Round{
    private final String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        this.roundScore = roundScore;
        this.redBoxerScore = redBoxerScore;
        this.blueBoxerScore = blueBoxerScore;
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

    }

    private String parseComaBlue(String score){
        return score;
    }

    private String parseComaRed(String score){
        return score;
    }
}
