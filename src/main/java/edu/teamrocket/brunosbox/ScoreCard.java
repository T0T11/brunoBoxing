package edu.teamrocket.brunosbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ScoreCard {
    private String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    public Round[] round;
    private byte redBoxerFinalScore = 0;
    private byte blueBoxerFinalScore = 0;

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

    void loadJudgeScoreCard(String[] judgeScoreCard){
        this.setJudgeScoreCard(judgeScoreCard);

        Optional<Round> round = Optional.empty();
        for (String roundScore : judgeScoreCard){
            round = Optional.ofNullable(RoundFactory.getRound(roundScore));
            round.ifPresent(this::addRound);
        }
    }


    int getRedBoxerFinalScore(){
        if (this.redBoxerFinalScore == 0){
            this.redBoxerFinalScore =
                    this.getRounds()
                            .stream()
                            .map(Round::getRedBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0, Integer::sum)
                            .byteValue();
        }
        return this.redBoxerFinalScore;
    }


    int getBlueBoxerFinalScore(){
        if (this.blueBoxerFinalScore == 0){
            this.blueBoxerFinalScore =
                    this.getRounds()
                            .stream()
                            .map(Round::getBlueBoxerScore)
                            .map(Byte::intValue)
                            .reduce(0, Integer::sum)
                            .byteValue();
        }
        return this.blueBoxerFinalScore;
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
        byte roundNum = 1;

        for (Round round : this.rounds) {
            roundsView.append("""
                \n\t%s\t %s\t  %s\t %s\t %s"""
                    .formatted(
                            round.getRedBoxerScore(),
                            redBoxerFinalScore += round.getRedBoxerScore(),
                            roundNum++,
                            blueBoxerFinalScore += round.getBlueBoxerScore(),
                            round.getBlueBoxerScore()
                    ));
        }

        return roundsView.toString();
    }

}
