package practice7;

public class ReversedString {

    public static void main(String[] args) {

        String data = "application";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(data);
        String reversedData = stringBuilder.reverse().toString();
        System.out.println(reversedData);
    }
}
