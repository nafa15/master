package practice5;

public class ArrayPractice2 {

    public static void main(String[] args) {
        String[] names = {"Adnan", "Rahman", "Rahat"};


        String name = "Meraj";
        System.out.println(name);


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[7]);
        }
            try {
                System.out.println(names[7]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("exception occured, try to fix your index");
                e.printStackTrace();
            }

    }
}
