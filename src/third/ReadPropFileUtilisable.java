package third;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Properties;

public class ReadPropFileUtilisable {


    public static String readPropFile(String filelocation , String key) throws IOException {

        FileInputStream file = new FileInputStream(filelocation) ;
        Properties prop = new Properties();
        prop.load(file);
        prop.getProperty(key);
        return  prop.getProperty(key);

    }

   /* public static void main(String[] args) throws IOException {
        String value1 = readPropFile("src/ayaln.properties","password");
        String value2 = readPropFile("src/ayaln.properties","usename");
        String value3 = readPropFile("src/ayaln.properties","name");
        String value4 = readPropFile("src/ayaln.properties","lastname");
        System.out.println(value1+","+value2+","+value3+","+value4  );
        ArrayList <String> list =new ArrayList<>();
        list.add(value1);
        list.add(value2);
        list.add(value3);
        list.add(value4);
        System.out.println(list);
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }


    }*/

}
