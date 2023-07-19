package demos.basicClass;

import java.time.LocalDate;


public class Person {

    public Person(String nom, String prenom,LocalDate ddn){
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
    }

    private String nom;
    private String prenom;
    private LocalDate ddn;

//        public P

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDdn() {
        return ddn;
    }

    private void setDdn(LocalDate ddn) {
        this.ddn = ddn;
    }
}
