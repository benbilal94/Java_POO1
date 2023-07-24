package demos.collection.constructeurRecap.models;

public class Loup extends Carnivore{
    //region Attributs

    private boolean estSolitaire;

    //endregion

    //region Constructeur

    public Loup(String name, int weight, int size, boolean estSolitaire) {
        super(name, weight, size,true);
        this.estSolitaire = estSolitaire;
    }

    //endregion

    //region Propriétés

    public boolean isEstSolitaire() {
        return estSolitaire;
    }

    public void setEstSolitaire(boolean estSolitaire) {
        this.estSolitaire = estSolitaire;
    }


    //endregion

    //region Methodes

    @Override
    public void crier() {
        System.out.println("Ahouuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Override
    public String toString() {
        return "Loup : " +
                super.toString() +
                "\nestSolitaire=" + estSolitaire;

    }

    //endregion
}
