package practice5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> listOfCity = new ArrayList<>();

        listOfCity.add("Queens");
        listOfCity.add("Bronx");
        listOfCity.add("Manhattan");

        listOfCity.add("Jersey City");
        listOfCity.remove(2);
        System.out.println(listOfCity);


        listOfCity.remove("Jersey City");

        System.out.println(listOfCity);
        System.out.println(listOfCity.size());
        System.out.println(listOfCity.get(0));

        for (int i=0; i<listOfCity.size();i++){
            System.out.println();
        }

        listOfCity.add("VA");
        listOfCity.add("DC");

        Iterator iterator= listOfCity.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
