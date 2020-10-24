package practice5;

import java.util.Random;

public class ArrayPractice3 {

    public static void main(String[] args) {
        int [] numbers= new int[5];

        numbers[0]= 1234;

        // Random int everytime
        Random random = new Random();
        int x = random.nextInt(5);

        System.out.println(x);

        // 1st loop to insert a random int in the array
        numbers[x]= random.nextInt(50);
        numbers[0]= random.nextInt(50);
        numbers[0]= random.nextInt(50);

        // 2nd loop to print all int from the array
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
