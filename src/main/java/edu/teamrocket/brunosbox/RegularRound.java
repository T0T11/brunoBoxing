package edu.teamrocket.brunosbox;

public class RegularRound  implements Round{
    private final String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;

    RegularRound(String roundScore) {
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
