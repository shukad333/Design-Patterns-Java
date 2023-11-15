package com.design.visitor;

public class Runner {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.accept(new ComputerPartVisitorImpl());
  }

}
