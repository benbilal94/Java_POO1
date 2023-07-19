package demos.basicClass;

import demos.basicClass.Person;

public abstract class Compte {


    private String numero;
    private double solde;
    private Person titulaire;

    public String getNumero() {
        return numero;
    }
    public Compte(String numero, Person titulaire,double solde){
        this(numero,titulaire);
        this.solde = solde;
    }
    public Compte(String numero,Person titulaire){
        this.numero = numero;
        this.titulaire = titulaire;
    }


    private void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public Person getTitulaire() {
        return titulaire;
    }

    private void setTitulaire(Person titulaire) {
        this.titulaire = titulaire;
    }

    public void retrait(double montant){

        retrait(montant,0);
    }

    public void retrait(double montant, double ligneDeCredit){

        if(montant < 0){
            return;
        }
        if(getSolde() - montant < - ligneDeCredit){
            return;
        }
        solde -= montant;
    }

    public void depot(double montant){
        if(montant < 0){
            return;
        }
        solde += montant;
    }

    protected abstract double CalculInteret();
}