package demos.heritage;

public class Voiture extends Vehicule {

    private int nbRoue;

    public int getNbRoue() {
        return nbRoue;
    }

    public void setNbRoue(int nbRoue) {
        this.nbRoue = nbRoue;
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je me roule en voiture");
    }

    @Override
    public String toString() {
        return super.toString() + "Voiture{" + "nbRoue=" + nbRoue + '}';
    }
}
