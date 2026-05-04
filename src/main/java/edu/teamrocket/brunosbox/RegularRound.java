package edu.teamrocket.brunosbox;

public class RegularRound implements Round {

    private final String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;
    public RoundFactory[] roundfactory;

    protected RegularRound(String roundScore){

        this.roundScore = roundScore.replaceAll("\\s", "");;
        boxerRoundScore();
    }

    public void boxerRoundScore() {

        String[] resultado = roundScore.split("-");
        redBoxerScore = Byte.parseByte(resultado[0]);
        blueBoxerScore = Byte.parseByte(resultado[1]);

    }

    @Override
    public String toString() {
        return getRedBoxerScore() + "-" + getBlueBoxerScore();
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }
}




