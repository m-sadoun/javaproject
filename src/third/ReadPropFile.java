package third;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class ReadPropFile {

    public static void main(String[] args) throws IOException {

        //FileInputStream fl = null;

        FileInputStream fl = new FileInputStream("src/ayaln.properties");

            Properties prop = new Properties();
            prop.load(fl );
         ArrayList <String> student= new ArrayList<>();
        student.add(prop.getProperty("password"));
        student.add( prop.getProperty("usename"));
        student.add( prop.getProperty("name"));
        student.add( prop.getProperty("lastname"));

        System.out.println(student);


    }
}