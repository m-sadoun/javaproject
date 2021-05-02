package hashMapAndArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayListInsiHasmop {
    public static void main(String[] args) {

        ArrayList<String> vilageSaharidj = new ArrayList<>();
        vilageSaharidj.add("mazrir");
        vilageSaharidj.add("iyilithen");
        vilageSaharidj.add("athhamad");
        vilageSaharidj.add("Athwalvan");
        vilageSaharidj.add("IghilHmad");
        vilageSaharidj.add("Iwakourn");
        ArrayList<String> vilageMchedallah = new ArrayList<>();
        vilageMchedallah.add("athyvrahim");
        vilageMchedallah.add("athyakhlef");
        vilageMchedallah.add("assifassemadh");
        vilageMchedallah.add("voumjvar");
        vilageMchedallah.add("th3ssassin");
        ArrayList<String> vilageLagar = new ArrayList<>();
        vilageLagar.add("ighilnath3mar");
        vilageLagar.add("rmta");
        vilageLagar.add("thiksrayen");
        vilageLagar.add("thamlahth");
        vilageLagar.add("Ighrem");

        HashMap<String, ArrayList> comune = new HashMap<>();
        comune.put("Saharij", vilageSaharidj);
        comune.put("Maillot", vilageMchedallah);
        comune.put("Lagar", vilageLagar);
        System.out.println("---------------------how to get a specifique keyvalue");
        System.out.println(comune.get("Saharij"));
        System.out.println("----------------------------how to get the keys -------------------------------");
        System.out.println(comune.keySet());
        System.out.println("-----------how to get the values of hash");
        System.out.println(comune.values());
        System.out.println("----------------------------how to chek the key if exixt or not ----------------");
        System.out.println(comune.containsKey("Maillot"));
        System.out.println("-------------------------------how to see the size of the hash--------------------");
        System.out.println(comune.size());
        System.out.println("------------------------------how to dispaly thr hash or how to read the hash----------");
        System.out.println(comune);
        System.out.println("-----------------------------how to get the value of the key--------------------------");
        System.out.println(comune.get("Saharij"));

        System.out.println("--------------------------------how to to read hash with inhanced forloop----------------");

        for (Map.Entry m : comune.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }


            System.out.println("---------------how to read the the value of the hash with Iterator class-------------");
            Iterator ita = comune.entrySet().iterator();
            while (ita.hasNext()) {
                System.out.println(ita.next());
            }


        }

    }

