package edu.teamrocket.brunosbox;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";

    ScoreCard(String color) {
        this.color = color;
        this.redCorner = redCorner;
        this.blueCorner = blueCorner;
    }

    void setRedCorner(String BoxerName) {
        this.redCorner = BoxerName;
    }

    void setBlueCorner(String BoxerName) {
        this.blueCorner = BoxerName;
    }
    byte getNumsRounds(){
        return 0;
    }
}
