package demos.collection.constructeurRecap;

import demos.collection.constructeurRecap.models.*;
import demos.collection.constructeurRecap.models.Animal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Animal> animaux = new ArrayList<>();

        animaux.add(new Lion("Simba",150,200,"Rouge"));
        animaux.add(new Loup("Talgor",100, 70,true));
        animaux.add(new Vache("Henriette",200,300,"Ardenne",true));
        animaux.add(new Ane("Diego",70,90,"Algérie",true));

        for (Animal a : animaux){
            System.out.println(a.toString());
            System.out.println("_________________________________________________");
        }

        for(Animal a : animaux) {

            if (a instanceof Herbivore h) {
//                Herbivore h = (Herbivore)a;
                h.nourir("Carottes");
            }
            if (a instanceof Carnivore c) {
                c.nourir("Wagyus", 10);
            }
            a.crier();
        }
    }
}