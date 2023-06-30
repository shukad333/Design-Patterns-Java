package com.design.pakkadesign.template;

public class GameEngine {

  public static void main(String[] args) {

    Game chess = new Chess();
    Game cricket = new Cricket();

    chess.play();
    cricket.play();

  }

}
