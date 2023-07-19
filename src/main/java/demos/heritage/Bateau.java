package demos.heritage;

public class Bateau extends Vehicule{
    private int nbVoiles;

    public int getNbVoiles() {
        return nbVoiles;
    }

    public void setNbVoiles(int nbVoiles) {
        this.nbVoiles = nbVoiles;
    }
    @Override
    public void seDeplacer(){
        System.out.println("Je me roule en Bateau");
    }

    @Override
    public String toString() {
        return super.toString() + "Bateau{" +
                "nbVoiles=" + nbVoiles +
                '}';
    }
}
