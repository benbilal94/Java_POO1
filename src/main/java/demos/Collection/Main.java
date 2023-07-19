package demos.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Pierre");
//        names.add("Pol");
//        names.add("Jaques");
//
//        // Or
//
////        names.addAll(List.of("Pierre","Paul","Jaques"));
//
////        pour inserer
//        names.add(1,"Carré");
//
////        retirer
//        names.remove("Paul");
////        Or
////        names.remove(1);
//        System.out.println(names.get(0));
//
////        set remplacer un element
//        names.set(0,"Rai");

        HashMap<Integer,String> communes = new HashMap<>();

        communes.put(4000,"Liège");
        communes.put(1000,"Bruxelles");
        communes.put(4347,"Fexhe");
        System.out.println(communes.get(1000));

        for (int cp : communes.keySet()){
            System.out.println(cp);
            System.out.println(communes.get(cp));
            System.out.println("--------------------------------");
        }

        for (String s: communes.values()) {
            System.out.println(s);
            System.out.println("---------------------");
        }

        for (Map.Entry<Integer,String> entry:communes.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-------------------------------");
        }
    }
}
