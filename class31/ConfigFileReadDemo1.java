package class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        // location of the path file from which we want to read the data
        String path="Files/config.properties";
        // a class that helps us navigate to that folder where file is store

        FileInputStream fileInputStream=new FileInputStream(path);
// this properties class will assist us to read and write data to property file
        Properties properties=new Properties();
    // load all the data from file inside  the above object 'properties'
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));
        fileInputStream.close();

    }
}
