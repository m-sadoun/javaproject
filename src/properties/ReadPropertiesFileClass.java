package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileClass {

    public static String readPropertiesFile(String filelocation, String key) throws IOException {
        FileInputStream file= new FileInputStream(filelocation);
        Properties properties= new Properties();
        properties.load(file);
          return properties.getProperty(key);



    }

}
