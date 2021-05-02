package hashMapAndArrayList;

import java.io.IOException;
import java.util.HashMap;

public class HasMapDemo {
    public static void main(String[]args) throws IOException {

        HashMap<String, String> employe = new HashMap<>();
         employe.put(FileRead.fileread("src/hashMapAndArrayList/emplo.properties","emp1"), FileRead.fileread("src/hashMapAndArrayList/emplo.properties","pass1"));
        employe.put(FileRead.fileread("src/hashMapAndArrayList/emplo.properties","emp2"), FileRead.fileread("src/hashMapAndArrayList/emplo.properties","pass2"));
        employe.put(FileRead.fileread("src/hashMapAndArrayList/emplo.properties","emp3"), FileRead.fileread("src/hashMapAndArrayList/emplo.properties","pass3"));
        employe.put(FileRead.fileread("src/hashMapAndArrayList/emplo.properties","emp4"), FileRead.fileread("src/hashMapAndArrayList/emplo.properties","pass4"));
        employe.put(FileRead.fileread("src/hashMapAndArrayList/emplo.properties","emp5"), FileRead.fileread("src/hashMapAndArrayList/emplo.properties","pass5"));

        System.out.println("------------------------the result after we read properties file---------------------");
        System.out.println(employe);
        System.out.println("how to remove element form the HASH");
        // we use a method remove with one parametre that is the key of Hashmap
        employe.remove("menad");
        System.out.println("---------tha hash after removing---------------");
        System.out.println(employe);
        employe.put("menad","1234");
        System.out.println("----------------the result after adding a value---------------------");

        employe.put(null,"12456");
        employe.put("sofiane",null);
       ;
        System.out.println( employe.get("menad"));
        employe.values();
        System.out.println( employe.keySet());

    }
}
