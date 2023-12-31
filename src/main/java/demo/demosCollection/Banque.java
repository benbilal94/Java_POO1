package demo.demosCollection;

import demos.basicClass.Courant;

import java.util.HashMap;

public class Banque {
    private String nom;
    private HashMap<String, Courant> comptes;

    public Banque(String nom){
        comptes = new HashMap<>();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<String, Courant> getComptes() {
//        return Map.copyOf(comptes)
        return (HashMap<String, Courant>) comptes.clone();
    }

    public void ajouterCompte(Courant c) {
        if (comptes.containsKey(c.getNumero())){
            return;
        }
        comptes.put(c.getNumero(),c);
    }

    public void supprimerCompte(String numero) {
        comptes.remove(numero);
    }

    public Courant recupCompte(String numero) {
        return getComptes().get(numero);
    }
}
