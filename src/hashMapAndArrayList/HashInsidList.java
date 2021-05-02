package hashMapAndArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashInsidList {
    public static void main(String[]args){

        HashMap <String, Integer>  student = new HashMap<>();
        student.put("sadmenad",1234);
        student.put("bhzineb",1245);
        student.put("sarab",1245);
        student.put("sayaln",1245);
        student.put("schafika",1245);
        student.put("snadjet",1245);
        student.put("shamida",1245);
       // System.out.println(student);
        HashMap<String, String> country =new HashMap<>();
        country.put("bejaaia","tazmalt");
        country.put("bouira","Maillot");
        country.put("Alger","belkour");
        country.put("blida ","soum3a");
        country.put("chelf","ainbessam");
        country.put("tiaret","thakrvouzth");
        country.put("batna","maillot");

        ArrayList<HashMap> all= new ArrayList<>();
        all.add(country);
        all.add(student);
        System.out.println("---------display with forloop--------------");
         for(int i=0; i<all.size();i++) {
             System.out.println(all.get(i));

         }
        System.out.println("----------display with jst name of arraylist--------------");
        System.out.println(all);
        System.out.println("---------------------read with Iterator cals-----------");
        Iterator ita= all.iterator();
        while (ita.hasNext()){
            System.out.println(ita.next());
        }

        System.out.println("--------------read with using advanced forllop------------");
        for(HashMap s: all){

            System.out.println(s);
        }
        System.out.println("------------ read the arraylist with regular forlop----------------");
         for(int i=0; i<all.size();i++){
             System.out.println(all.get(i));
         }






    }

}
