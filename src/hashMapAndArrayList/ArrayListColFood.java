package hashMapAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListColFood {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> color = new ArrayList<String>();
        System.out.println("please enter your five favorite food");
        for (int j = 0; j <= 4; j++) {
            food.add(enter.nextLine());

        }
        System.out.println("please enter your five color ");
        for (int k = 0; k <= 4; k++) {
            color.add(enter.nextLine());

        }


        //String ss = enter.nextLine();
        System.out.println("Customer like these kind of food " + food);
        System.out.println("Customer like these colors " + color);
        for (int i = 0; i < food.size(); i++) {
            String value = food.get(i);
            color.add(value);
        }

        System.out.println("here are customer favorite " + color);

        enter.close();
    }

}
