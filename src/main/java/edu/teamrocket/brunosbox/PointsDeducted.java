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
    public byte redBoxerScore() {
        return this.redBoxerScore;
    }
    @Override
    public byte blueBoxerScore() {
        return this.blueBoxerScore;
    }

    private byte parseComaBlue(String score){
        return score;
    }

    private byte parseComaRed(String score){
        return score;
    }
}
