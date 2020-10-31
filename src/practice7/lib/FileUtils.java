package practice7.lib;

import java.io.*;
import java.util.Properties;

public class FileUtils {

    public static String getPropertyFromFile(String filePath, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        String data = properties.getProperty(key);
        return data;
    }

    public String getDataFromTextFile(String filePath) throws IOException{
        String tmpcontainer;
        String finalText="";

        FileReader fileReader= new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpcontainer = bufferedReader.readLine())!=null) {
            finalText = tmpcontainer;
        }
        return finalText;
    }

    public static void main(String[] args) throws IOException {

        String tmpcontainer;
        String finalText="";

        FileReader fileReader= new FileReader("src/practice7/lib/today.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpcontainer = bufferedReader.readLine())!=null){
            finalText = tmpcontainer;

            System.out.println(finalText);
        }
    }
}

