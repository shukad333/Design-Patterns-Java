package com.design.chainofcomm;

public class LoggerTest {

    Logger setChaining() {

        Debug debug = new Debug(Logger.DEBUG);

        Info info = new Info(Logger.INFO);

        Error error = new Error(Logger.ERROR);

        debug.setNext(info);
        info.setNext(error);
        return debug;

    }


    public static void main(String[] args) {

        LoggerTest test = new LoggerTest();
        Logger l = test.setChaining();
        l.log(Logger.INFO,"Shuhila");
        l.log(Logger.DEBUG,"Litchi");

        l.log(Logger.ERROR,"Nooru");

    }

}
