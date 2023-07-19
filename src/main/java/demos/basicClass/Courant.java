package demos.basicClass;

public class Courant extends Compte {
    private double ligneDeCredit;


    public  Courant(String numero, Person titulaire,double ligneDeCredit){
        super(numero,titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }
    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {
        if(ligneDeCredit < 0){
            return;
        }
        this.ligneDeCredit = ligneDeCredit;
    }

    @Override
    protected double CalculInteret(){
        double interet;
        if (getSolde() > 0){
            interet = (getSolde() /100) * 3;
        }else {
            interet=getSolde()/100 * 9.75;
        }
        return interet;
    }
    @Override
    public void retrait(double montant, double ligneDeCredit) {
        super.retrait(montant,getLigneDeCredit());
    }
}