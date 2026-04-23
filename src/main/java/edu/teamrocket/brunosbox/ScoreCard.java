package edu.teamrocket.brunosbox;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    public Round[] round;

    ScoreCard(String color) {
        this.color = color;
        this.redCorner = redCorner;
        this.blueCorner = blueCorner;
    }

    public void setBlueCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public void setRedCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    byte getNumRounds() {
        return 0;
    }

    void loadJudgeCard(String[] judgeScoreCard)


    int getRedBoxerFinalScore(){
        return 0;
    }


    int getBluefinalScore(){
        return 0;
    }

     String viewRounds()

}
