package demo.demosCollection;

import demos.basicClass.Person;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Pierre");
//        names.add("Pol");
//        names.add("Jacques");
//
////        names.addAll(List.of("Pierre","Pol","Jacques"));
//
//        names.remove("Pol");
////        names.remove(1);
//
////        System.out.println(names.get(0));
//
//        names.add(1,"Spicy");
//
//        for (String s : names){
//
//            System.out.println(s);
//        }

//        HashMap<Integer,String> communes = new HashMap<>();
//
//        communes.put(4000,"Liège");
//        communes.put(1000,"Bruxelle");
//        communes.put(4347,"Fexhe");
//
//        System.out.println(communes.get(4000));
//
//        for (int cp : communes.keySet()){
//
//            System.out.println(cp);
//            System.out.println(communes.get(cp));
//            System.out.println("___________________________________");
//        }
//
//        for (String s : communes.values()){
//            System.out.println(s);
//            System.out.println("___________________________________");
//        }
//
//        for (Map.Entry<Integer,String> entry : communes.entrySet()){
//
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("___________________________________");
//        }

        Set<Person> people = new HashSet<>();
        people.add(new Person("Lee","Bruce", LocalDate.of(1980,2,6)));

        HashMap<Integer, Commune> communes = new HashMap<>();

        Commune c = new Commune(4000,"Liège",100_000);

        communes.put(c.getCodePostal(),c);

        System.out.println(communes.get(4000).getNom());

//        ArrayList<Commune> communes1 = new ArrayList<>();
//        communes1.add(c);
//
//        communes1.get(0);

        HashMap<String,Person> persons = new HashMap<>();

        Person p = new Person("Lee","Bruce",LocalDate.of(1980,2,6));

        persons.put(p.getNom(),p);

        System.out.println(persons.get("Lee").getPrenom());




























    }
}