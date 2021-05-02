package hashMapAndArrayList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class ReadPropFileStoreArray {

    public static void main(String[]args) throws IOException {

         InputStream file= new FileInputStream("src/hashMapAndArrayList/ayaln.properties");
        Properties prop1= new Properties();
        prop1.load(file);
        //String a[]=new String[4];
       /* a[0] =prop1.getProperty("password");
        a[1] =prop1.getProperty("usename");
        a[2]  =prop1.getProperty("name");
        a[3]  =prop1.getProperty("lastname");*/
       String a[]= {prop1.getProperty("password"), prop1.getProperty("usename"), prop1.getProperty("lastname"), prop1.getProperty("name")};
      // String a[]= {s1,s2,s3, s4 };
        Arrays.toString(a);
        System.out.println(Arrays.toString(a));

       // for (int i=0; i<a.length;i++){
           // System.out.println(a[i]);
       // }

    }
    }

