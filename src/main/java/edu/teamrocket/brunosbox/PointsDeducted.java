package edu.teamrocket.brunosbox;

public class PointsDeducted implements Round{
    private final String roundScore;
    public byte redBoxerScore;
    public byte blueBoxerScore;

    protected PointsDeducted(String roundScore) {

        this.roundScore = roundScore.replaceAll("\\s", "");
        boxerRoundScore();
    }


    String getRoundScore() {
        return this.roundScore;
    }

        public void boxerRoundScore() {

        String[] scores = getRoundScore().split("-", 2);
        String redBoxerRoundScore = scores[0];
        String blueBoxerRoundScore = scores[1];

        if (redBoxerRoundScore.indexOf(',') == -1) {
            this.redBoxerScore = Byte.parseByte(redBoxerRoundScore);
            this.blueBoxerScore = this.parseComaBlue(blueBoxerRoundScore);
        } else {
            this.blueBoxerScore = Byte.parseByte(blueBoxerRoundScore);
            this.redBoxerScore = this.parseComaRed(redBoxerRoundScore);
        }
    }

    private Byte parseComaBlue(String score) {
        // score = "8,1"
        return Byte.parseByte(score.substring(0, score.indexOf(',')));
    }

    private Byte parseComaRed(String score) {
        // score = "1,8"
        return Byte.parseByte(score.substring(score.indexOf(',') + 1, score.length()));
    }


    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }


    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return getRedBoxerScore() + " - " + getBlueBoxerScore();
    }
}
