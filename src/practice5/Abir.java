package practice5;

import java.util.Scanner;

public class Abir {

    public static void main(String[] args) {

                Scanner scanner=new Scanner(System.in);
                System.out.println("Welcome To The Burger House");
                System.out.println("What can I get you today?");
                String item = scanner.nextLine();
                System.out.println("We are sorry, we are out of it!");
                System.out.println("Can I get you anything else?");
                String item2 = scanner.nextLine();
                System.out.println("we don't have it either");
        manager();

        String issue= scanner.next();
        System.out.println("That's correct, we have anything but food");
        System.out.println("Pleas visit us again!");
    }
    public static void manager(){
        Scanner scanner= new Scanner(System.in);
        String manager =scanner.next();
        System.out.println("Hello, I am the manager");
        System.out.println("What seems to be the problem?");
    }
}
