package com.cc.dd.aa;

public class ThreadLocalEx {


}

class ThreadLocalTest {
    ThreadLocal<String> tl = new ThreadLocal<>() {

        @Override
        protected String initialValue() {
            return "One";
        }
    };

}
