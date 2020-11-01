package review;

public class Laptop {

    String model;
    int year;
    String make;

    public Laptop(){

    }

    public Laptop(String model, String make){
        this.make=make;
        this.model=model;

    }

    public Laptop(String model, int year, String make){
        this.make=make;
        this.year=year;
        this.model=model;
    }
    public void detailsOfLaptop(){
        System.out.println(make);
        System.out.println(year);
        System.out.println(model);
    }
}
