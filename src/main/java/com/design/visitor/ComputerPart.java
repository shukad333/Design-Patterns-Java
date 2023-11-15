package com.design.visitor;

public interface ComputerPart {

  void accept(ComputerPartVisitor computerPartVisitor);

}
