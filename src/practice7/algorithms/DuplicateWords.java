package practice7.algorithms;

import java.util.HashMap;

public class DuplicateWords {

    public static void main(String[] args) {


        String data = "Java is a programming language. Java is also an island of Indonesia. Java is widely used in development";

        String[] splittedData = data.split(" ");

        System.out.println(splittedData.length);

        HashMap<String,Integer> occurences = new HashMap<>();

        for (int i=0; i< splittedData.length; i++){
            Integer previousCount = occurences.get(splittedData[i]);
            if (previousCount==null){
                previousCount=0;
            }
            occurences.put(splittedData[i], previousCount+1);
        }


        System.out.println(occurences);

    }
}