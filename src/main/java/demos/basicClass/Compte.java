package demos.basicClass;

import demos.basicClass.interfaces.Banker;
import demos.basicClass.interfaces.Customer;
import demos.exeption.SoldeInsuffisantException;
import demos.basicClass.interfaces.PassageEnNegatifSubscriber;

public abstract class Compte implements Customer,Banker {

    private PassageEnNegatifSubscriber passageEnNegatifEvent;
    private String numero;
    private double solde;
    private Person titulaire;

    public Compte(String numero, Person titulaire, double solde) {
        this(numero, titulaire);
        this.solde = solde;
    }

    public Compte(String numero, Person titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public String getNumero() {
        return numero;
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

    public void retrait(double montant) throws SoldeInsuffisantException {

        retrait(montant, 0);
    }


    public void retrait(double montant, double ligneDeCredit) throws SoldeInsuffisantException {

        if (montant < 0) {
            throw new IllegalArgumentException("Le montant doit etre positif");
        }
        if (getSolde() - montant < -ligneDeCredit) {
            return;
        }
        solde -= montant;
    }

    public void depot(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
        solde += montant;
    }

    protected abstract double calculInteret();

    public void appliquerInteret() {
        solde += calculInteret();
    }

    public void setPassageEnNegatifEvent(PassageEnNegatifSubscriber subscriber){

        passageEnNegatifEvent = subscriber;
    }

    public void raisePassageEnNegatifEvent(){

        if(passageEnNegatifEvent == null){
            return;
        }
        passageEnNegatifEvent.execute(this);
    }
}