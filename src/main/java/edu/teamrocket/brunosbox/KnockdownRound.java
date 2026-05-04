package edu.teamrocket.brunosbox;

  class KnockdownRound implements Round{

     private String roundScore;
     public byte redBoxerScore;
     public byte blueBoxerScore;
     /*rojo izquierda azul derecha*/

    protected KnockdownRound(String roundScore) {

         this.roundScore = roundScore.replaceAll("\\s", "");;
         boxerRoundScore();
    }

     public void boxerRoundScore() {

        String[] resultado = roundScore.split("-");
        redBoxerScore = Byte.parseByte(resultado[0]);
        blueBoxerScore = Byte.parseByte(resultado[1]);

     }

      @Override
      public byte getBlueBoxerScore() {
          return this.blueBoxerScore;
      }

      @Override
      public byte getRedBoxerScore() {
          return this.redBoxerScore;
      }

      @Override
      public String toString() {
          return getRedBoxerScore() + "-" + getBlueBoxerScore() ;

  }
  }