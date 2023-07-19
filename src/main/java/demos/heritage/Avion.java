package demos.heritage;

public class Avion extends Vehicule{
    private int nbMoteurs;

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }
    @Override
    public void seDeplacer(){
        System.out.println("Je me roule en Avion");
    }

    @Override
    public String toString() {
        return super.toString() + "Avion{" +
                "nbMoteurs=" + nbMoteurs +
                '}';
    }
}
