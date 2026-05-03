package edu.teamrocket.brunosbox;

  class KnockdownRound implements Round{

     private String roundScore;
     public byte redBoxerScore;
     public byte blueBoxerScore;
     /*rojo izquierda azul derecha*/

     KnockdownRound(String roundScore) {

         this.roundScore = roundScore;
         boxerRoundScore();
    }

     public void boxerRoundScore() {

        String[] resultado = roundScore.split("-");
        redBoxerScore = Byte.parseByte(resultado[0]);
        blueBoxerScore = Byte.parseByte(resultado[1]);

     }

      @Override
      public String toString() {
          return redBoxerScore + "-" + blueBoxerScore ;

  }
  }