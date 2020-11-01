package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class DataReader {
    // given you have a text file in your machine
    // rad that text file, and store every word of he file into a Arraylist
    // and store also in a Hashmap where the word is your key and how many time it occured if your value

    public static void main(String[] args) throws IOException {

        String tmpcontainer;
        String finalText = "";

        FileReader fileReader = new FileReader("src/review/Data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpcontainer = bufferedReader.readLine()) != null) {
            finalText = tmpcontainer;

            // System.out.println(finalText);

            String[] data = finalText.split(" ");

            ArrayList<String> datalist = new ArrayList<>();
            for (int i = 0; i < data.length; i++) {
                datalist.add(data[i]);
            }

            System.out.println(datalist);

            HashMap<String, Integer> mapOfData = new HashMap<>();

            for (int i=0; i<datalist.size(); i++){

                Integer counter = mapOfData.get(datalist.get(i));
                if (counter == null){
                    counter = 1;
                }else {
                    counter = counter + 1;
                }
                mapOfData.put(datalist.get(i), counter );
            }

            System.out.println(mapOfData);

        }

    }


}
