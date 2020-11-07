package practice7.algorithms;

import java.util.Arrays;

public class Anangram {

    public static void main(String[] args) {

        String a = "ARMY";
        String b = "MARY";

        getAnangram(a,b);
    }

    public static void getAnangram(String a, String b){

        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        boolean anangram = Arrays.equals(firstArray,secondArray);

        if (anangram){
            System.out.println("values are anagrams");
        } else {
            System.out.println("values are not anagrams");
        }

    }


}
