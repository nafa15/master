package practice6.lib;

        // try to find out how can we reuse the same code here again like we did

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static void main(String[] args) throws IOException {

        Properties properties= new Properties();

        InputStream inputStream= new FileInputStream("src/practice6/lib/config.properties");
        properties.load(inputStream);

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String dbname= properties.getProperty("dbname");

        System.out.println(username+" "+password+" "+dbname);
    }
}
