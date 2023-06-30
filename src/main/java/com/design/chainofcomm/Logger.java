package com.design.chainofcomm;

abstract class Logger {

    public static final int DEBUG = 0;
    public static final int INFO = 1;
    public static final int ERROR = 2;

    int level;
    public Logger(int level) {
        this.level = level;
    }

    Logger next;

    void setNext(Logger next) {
        this.next = next;
    }
    void log(int levels , String message) {

        if(this.level<=levels) {
            logMessage(message);
        }

        if(next!=null) {
            next.log(levels,message);
        }
    }

    abstract void logMessage(String message);



}

class Info extends Logger {

    public Info(int level) {
        super(level);
    }
    @Override
    void logMessage(String message) {
        System.out.println("Info "+message);
    }
}


class Error extends Logger {

    public Error(int level) {
        super(level);
    }
    @Override
    void logMessage(String message) {
        System.out.println("Error "+message);
    }
}



class Debug extends Logger {

    public Debug(int level) {
        super(level);
    }
    @Override
    void logMessage(String message) {
        System.out.println("Debug "+message);
    }
}
