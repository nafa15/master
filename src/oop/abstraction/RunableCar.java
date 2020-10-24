package oop.abstraction;

public class RunableCar extends Car implements Vehicle {

    // i - i
    // implements
    //

    @Override
    public void wheels() {
        System.out.println("4 wheels");
    }

    @Override
    public void move() {
        System.out.println("runable car is moving");
    }

    @Override
    public void start() {
        System.out.println("runable car can start");

    }

    @Override
    public void stop() {
        System.out.println("runable car can stop");

    }

    @Override
    public void name() {

    }
}
