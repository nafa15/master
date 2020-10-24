package practice5;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList cityOfUSA = new ArrayList();
        cityOfUSA.add("New York");
        cityOfUSA.add("New Jersey");
        cityOfUSA.add("Virginia");


        ArrayList cityOfCanada = new ArrayList();
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Victoria");


        ArrayList<ArrayList<String>> world = new ArrayList<>();
        world.add(cityOfCanada);
        world.add(cityOfUSA);

        System.out.println(world);

    }
}
