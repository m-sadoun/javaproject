package hashMapAndArrayList;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileRead {


        public static String fileread(String location,String key) throws IOException {

            FileInputStream fis= new  FileInputStream(location);
            Properties prop= new Properties();
            prop.load(fis);

            return prop.getProperty(key);
        }

    }



