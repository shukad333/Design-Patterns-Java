package com.design.visitor;

public interface ComputerPartVisitor {

  void visit(Mouse mouse);
  void visit(KeyBoard keyBoard);

  void visit(Computer computer);

}
