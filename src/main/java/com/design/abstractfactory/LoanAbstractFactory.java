package com.design.abstractfactory;

public class LoanAbstractFactory {
}





class LoanFactory extends AbstractFactory {

    @Override
    Bank getBank(String name) {
        return null;
    }

    @Override
    Loan getLoan(String loanName) {
        return null;
    }
}

abstract class AbstractFactory {
    abstract Bank getBank(String name);
    abstract Loan getLoan(String loanName);
}
interface Bank {
    String name();
}

interface Loan {
    float interest();
}

class HomeLoan implements Loan {
    @Override
    public float interest() {
        return 12.7f;
    }
}

class PropertyLoan implements Loan {
    @Override
    public float interest() {
        return 13.5f;
    }
}

class HDFC implements Bank {
    @Override
    public String name() {
        return "HDFC";
    }
}


class ICICI implements Bank {
    @Override
    public String name() {
        return "HDFC";
    }
}
