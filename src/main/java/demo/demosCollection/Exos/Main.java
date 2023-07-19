package demo.demosCollection.Exos;

import demo.demosCollection.Banque;
import demos.basicClass.Courant;
import demos.basicClass.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("Les voleurs");

        Person david = new Person("David","Pelemens",LocalDate.of(1980,2,6));
        Courant compteDeDavid = new Courant("BE00_0000_0000",david,1000);
        /////////////////////////////////////////
        Person Eric = new Person("Eric","Parade",LocalDate.of(1980,2,6));
        Courant compteDeEric = new Courant("BE11_1111_1111",Eric,5000);


        // Ajouter un compte avec
        banque.ajouterCompte(compteDeDavid);
        System.out.println(banque.recupCompte("BE00_0000_0000"));
    }
}
