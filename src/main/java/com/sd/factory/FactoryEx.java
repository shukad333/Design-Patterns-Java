package com.sd.factory;

public class FactoryEx {

    public static void main(String[] args) {

        Car car = CarFactory.instance.getCar("aaa");
        System.out.println(car.makeCar());

    }
}



interface Car {

    String makeCar();

}

class Honda implements Car {
    @Override
    public String makeCar() {
        return "Honda Made";
    }
}


class BMW implements Car {
    @Override
    public String makeCar() {
        return "BMW Made";
    }
}


class CarFactory {

    public static CarFactory instance = new CarFactory();
    private CarFactory() {};

    public Car getCar(String car) {
        if(car.equals("bmw"))
            return new BMW();
        else
            return new Honda();
    }
}