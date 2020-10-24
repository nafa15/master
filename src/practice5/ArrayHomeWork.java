package practice5;

import java.util.Random;

public class ArrayHomeWork {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers [0]= 1234;

        Random random = new Random();

        int x = random.nextInt(1000);

        for (int a= 0; a < numbers.length; a++) {
            System.out.println(numbers[x]);
        }
    }
}
