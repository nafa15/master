package practice5;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {

        HashMap<String, Integer> cityAndZipOfUSA =new HashMap<>();
        cityAndZipOfUSA.put("Carmel", 46033);
        cityAndZipOfUSA.put("Indianapolis", 46240);



        HashMap<String, Integer> cityAndZipOfCanada= new HashMap<>();
        cityAndZipOfCanada.put("Toronto", 46253);
        cityAndZipOfCanada.put("Montreal", 45698);

        HashMap<String, HashMap<String, Integer>> map = new HashMap();

        map.put("USA", cityAndZipOfUSA);
        map.put("Canada", cityAndZipOfCanada);

        System.out.println(map);

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfCanada);
        list.add(cityAndZipOfUSA);

        System.out.println(list);

    }
}
