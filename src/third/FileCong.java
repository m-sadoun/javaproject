package third;

import java.util.ArrayList;
import java.util.Scanner;

public class FileCong {
    public static void main(String[] args) {
        //ArrayList list= new ArrayList();// the declaration of arraylist without specfiying the type
        ArrayList<String> list = new ArrayList<String>();

        // adding value
        list.add("menad");
        list.add("salim");
        list.add("Zineb");
        list.add("arab");
        list.add("ahmed");
        // System.out.println( "before removing the element" +list);
        // the size of array list
        list.size();
        System.out.println(list.size());
        // how to remove specifique element  we need a specifique index
        list.remove(3);
        //System.out.println("before removing the element" +list);
        // insertion oof the new ellement
        list.add("chafika");
        //System.out.println(list);
        list.add(2, "ayaln");
        System.out.println(list);

       for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }


    }


}
