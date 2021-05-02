package third;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String> list= new HashMap<Integer,String>();
        // adding the value to hasmmap
        list.put(102, "menad");
        list.put(103, "ahmed");
        list.put(104, "ali");


       /* list.size();
        System.out.println(list.size());
        System.out.println(list);
        list.remove(102);
        System.out.println(list.size());
        System.out.println(list);*/
        System.out.println(  list.keySet());

        for(int i=0; i <list.size(); i++)
        {


            System.out.println(  list.keySet());
        }









     }


}
