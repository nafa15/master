package oop.inheritance;

public class C extends B {

    public void methodFromC() {
        System.out.println("method details form C");

    }

    public static void main(String[] args){
        C c = new C();
        c.methodFromC();
        c.methodFromB();


    }
}
