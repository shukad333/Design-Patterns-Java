package com.design.visitor;

public class ComputerPartVisitorImpl implements ComputerPartVisitor{

  @Override
  public void visit(Mouse mouse) {

    System.out.println("Mouse");

  }

  @Override
  public void visit(KeyBoard keyBoard) {

    System.out.println("Keyboard");
  }

  @Override
  public void visit(Computer computer) {
    System.out.println("Computer");
  }
}
