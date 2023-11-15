package com.design.visitor;

public class Computer implements ComputerPart{

  ComputerPart[] parts = new ComputerPart[]{new KeyBoard(),new Mouse()};
  @Override
  public void accept(ComputerPartVisitor computerPartVisitor) {
    for(ComputerPart part : parts) {
      part.accept(computerPartVisitor);
    }
    computerPartVisitor.visit(this);
  }
}
