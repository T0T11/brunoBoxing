package edu.teamrocket.brunosbox;

 public class KnockdownRound implements Round {

     private String roundScore;
     private byte redBoxerScore;
     private byte blueBoxerScore;


    KnockdownRound(String roundScore) {
        this.roundScore = roundScore;
        this.redBoxerScore = redBoxerScore;
        this.blueBoxerScore = blueBoxerScore;
    }

     public void boxerRoundScore() {


         String[] parts = roundScore.split("-");
         this.redBoxerScore = Byte.parseByte(parts[0]);
         this.blueBoxerScore = Byte.parseByte(parts[1]);
     }

     public byte getRedBoxerScore() {
         return this.redBoxerScore;
     }

     public byte getBlueBoxerScore() {
         return this.blueBoxerScore;
     }

     @Override
     public String toString() {
         return "KnockdownRound{" +
                 "roundScore='" + roundScore + '\'' +
                 ", redBoxerScore=" + redBoxerScore +
                 ", blueBoxerScore=" + blueBoxerScore +
                 '}';
     }
 }