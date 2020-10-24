package practice5;

public class Laptop {

    // Singleton --> single instance of a class
    // 1. private static object of the class (half way)

    private static Laptop laptop= null;

    //2. private constructor
    private Laptop(){

    }

    //3. public static method which has

    public static Laptop getInstance(){
        if (laptop==null){
            laptop = new Laptop();
        }
        return laptop;
    }

    public String getModelOfLaptop(){
        return "MacBook Pro";
    }
}
