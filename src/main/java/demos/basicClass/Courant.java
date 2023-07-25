package demos.basicClass;

import demos.exeption.ArgumentOutOfRangeException;
import demos.exeption.SoldeInsuffisantException;

public class Courant extends Compte {
    private double ligneDeCredit;


    public  Courant(String numero, Person titulaire,double ligneDeCredit) throws ArgumentOutOfRangeException {
        super(numero,titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    public Courant(String numero,Person titulaire){
        super(numero,titulaire);
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    private void setLigneDeCredit(double ligneDeCredit) throws ArgumentOutOfRangeException {
        if(ligneDeCredit < 0){
            throw new IllegalStateException("Ligne de crédit doit être positive.");
        }
        this.ligneDeCredit = ligneDeCredit;
    }

    @Override
    public void retrait(double montant) throws SoldeInsuffisantException {
        super.retrait(montant,getLigneDeCredit());
    }
    @Override
    protected double calculInteret(){
        if (getSolde() < 0 ){
            return  getSolde() * 0.0975;
        }
        return getSolde() * 0.03;
//        return getSolde() < 0 ? getSolde() * 0.0975 : getSolde() * 0.03;
    }
}