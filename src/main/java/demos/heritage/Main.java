package demos.heritage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicule v1 = new Vehicule();
        v1.seDeplacer();

        Voiture voiture = new Voiture();
        voiture.setMarque("Dodge");
        voiture.setModele("RAM");
        Bateau bateau = new Bateau();

        bateau.setMarque("Pegasus");
        bateau.setModele("Le seul et l'unique");
        Avion avion = new Avion();

        avion.setMarque("Diamond-DA40");
        avion.setModele("Diamond-DA40");

        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Voiture());
        vehicules.add(new Bateau());
        vehicules.add(new Avion());

        System.out.println("------------------------------------------");

        for (Vehicule v : vehicules) {
            v.seDeplacer();
        }
    }
}
