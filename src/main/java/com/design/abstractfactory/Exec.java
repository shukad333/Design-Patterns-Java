package com.design.abstractfactory;

public class Exec {


}




enum PhoneCompany {
    SAMSUNG,
    IPHONE
}
abstract class PhoneFactory {

    static PhoneFactory getFactory(PhoneCompany phoneCompany) {
        if(phoneCompany == PhoneCompany.SAMSUNG) {

            return new Samsung();
        }

        return new Iphone();
    }
    abstract OS buildOs();
    abstract Chip buildChip();
}


class Samsung extends PhoneFactory {


    @Override
    OS buildOs() {
        return new Android();
    }

    @Override
    Chip buildChip() {
        return new Tensor();
    }
}

class Iphone extends PhoneFactory {


    @Override
    OS buildOs() {
        return new IOS();
    }

    @Override
    Chip buildChip() {
        return new A15();
    }
}



interface OS {
    String buildOS();
}

interface Chip {
    String buildChip();
}

class Tensor implements Chip {
    @Override
    public String buildChip() {
        return "Tensor";
    }
}

class A15 implements Chip {
    @Override
    public String buildChip() {
        return "A15";
    }
}

class IOS implements OS {
    @Override
    public String buildOS() {
        return "ios";
    }
}

class Android implements OS {
    @Override
    public String buildOS() {
        return "android";
    }
}

