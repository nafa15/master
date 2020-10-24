package oop.abstraction;

public class UserWhoUseThecar {

    public static void main(String[] args){

        RunableCar runablecar= new RunableCar();
        runablecar.move();

        runablecar.wheels();
        runablecar.brake();

    }
}
