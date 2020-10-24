package practice5;

import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Integer, String> student = new Hashtable<>();
        student.put(32, "Jafor");
        student.put(53, "Sraboni");
        student.put(12, "David");
       // student.put(null, "Jafor");
        System.out.println(student);
    }
}
