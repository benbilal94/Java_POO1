package demos.basicClass;

import demos.basicClass.Person;

import java.time.LocalDateTime;



public class Epargne extends Compte{

    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Person titulaire) {
        super(numero, titulaire);
    }
    public  Epargne(String numero,Person titulaire , double solde){
        super(numero,titulaire,solde);
    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    @Override
    public void retrait(double montant, double ligneDeCredit) {
        double previous = getSolde();
        super.retrait(montant, ligneDeCredit);
        if(previous > getSolde()){
            setDateDernierRetrait(LocalDateTime.now());
        }
    }

    @Override
    protected double CalculInteret() {
        return 0;
    }
}
