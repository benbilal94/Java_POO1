package demos.basicClass.interfaces;

import demos.basicClass.Person;

public interface Banker extends Customer{

    void appliquerInteret();
    Person getTitulaire();
    String getNumero();

}

