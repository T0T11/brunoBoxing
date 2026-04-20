package edu.teamrocket.brunosbox;

public class KnockdownRound implements Round {

    private String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;


    KnockdownRound(String roundScore) {
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
}
