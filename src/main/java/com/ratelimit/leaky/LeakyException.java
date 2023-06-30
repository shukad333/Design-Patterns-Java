package com.ratelimit.leaky;

public class LeakyException extends Exception{
    public LeakyException(String message) {
        super(message);
    }

    public void simple() throws LeakyException {
        throw new LeakyException("Shuhail");
    }

    public static void main(String[] args) {

        try {
            new LeakyException("abc").simple();
        }
        catch (Exception re) {
            System.out.println(re.getMessage());
        }
    }
}
