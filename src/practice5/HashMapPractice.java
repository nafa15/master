package practice5;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        //key-value

        HashMap<Integer,String> studentInformation = new HashMap<>();

        studentInformation.put(1532, "Nusrut");
        studentInformation.put(4652, "Micheal");
        studentInformation.put(4568, "David");

        System.out.println(studentInformation.get(4652));

        HashMap<String, Integer> locationInformation = new HashMap<>();
        locationInformation.put("Rego Park", 11374);
        locationInformation.put("Grand Concourse", 11646);

        System.out.println(locationInformation.get("Rego Park"));
        System.out.println(locationInformation.size());
        System.out.println(locationInformation.containsKey(258));
        System.out.println(locationInformation.containsValue(11374));

    }
}
