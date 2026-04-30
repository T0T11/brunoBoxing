package edu.teamrocket.brunosbox;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    public Round[] round;

    private List<Round> rounds = new ArrayList<Round>();

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
        return (byte) this.rounds.size();
    }

    List<Round> getRounds() {
        return this.rounds;
    }
    private void addRound(Round round){
        this.rounds.add(round);
    }

    private void setJudgeScoreCard(String[] judgeScoreCard){
        this.judgeScoreCard = judgeScoreCard;
    }

    void loadJudgeScoreCard(String[] judgeScoreCard){}


    int getRedBoxerFinalScore(){
        return 0;
    }


    int getBlueBoxerFinalScore(){
        return 0;
    }

    @Override
    public String toString() {
        return """
                \t\t\t   %s
                \t\t%s\t%s
                \t\t\t%s rounds
                %s
                \t   FINAL SCORE: %s - %s FINAL SCORE"""
                .formatted(
                        this.color,
                        this.blueCorner,
                        this.redCorner,
                        this.getNumRounds(),
                        this.viewRounds(),
                        this.getRedBoxerFinalScore(),
                        this.getBlueBoxerFinalScore()
                );
    }

    private String viewRounds(){
        StringBuilder roundsView = new StringBuilder();
        roundsView.append("""
            \tRound \t Score \t Round \t Score \t Round
            \tScore \t Total \t       \t Total \t Score""");
        return roundsView.toString();
    }

}
