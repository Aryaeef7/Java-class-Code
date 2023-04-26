package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemoExample {
    public static void main(String[] args) throws IOException {

        String path="Files/Test.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("suer=","123");
        properties.setProperty("password=","abc123");
        properties.store(fileOutputStream,"new added");
    }
}
