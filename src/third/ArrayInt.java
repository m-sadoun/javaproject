package third;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayInt {
    public static void main (String[] args){

        ArrayList<Integer> number =new ArrayList<>();
         number.add(1);
         number.add(0);
         number.add(1,20);
         number.add(11);
         number.size();

         for(int i=0; i<number.size();i++)
         {
             int x=number.get(i);
             System.out.println(x);
         }
         System.out.println(number.size());
         System.out.println(number.isEmpty());
         number.remove("20");
         System.out.println(number);
         ArrayList<String> names = new ArrayList<>();
          String  name[]= {"menad", "sadoun","arab","hamid"};
          for (int i=0;i<name.length;i++){
              names.add(name[i]);
          }
         System.out.println(names);
          names.remove(0);
        System.out.println("----------------------after removing---------------------------");
        Iterator ita= number.iterator();
            while(ita.hasNext()){
                System.out.println(ita.next());
            }
    }
}
