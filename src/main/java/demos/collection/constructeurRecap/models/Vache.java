package demos.collection.constructeurRecap.models;

public class Vache extends Herbivore{

    private boolean estTachetee;

    public Vache(String name, int weight, int size, String paramRegion, boolean estTachetee) {
        super(name, weight, size, paramRegion);
        this.estTachetee = estTachetee;
    }

    //endregion

    //region Propriétés

    public boolean isEstTachetee() {
        return estTachetee;
    }

    public void setEstTachetee(boolean estTachetee) {
        this.estTachetee = estTachetee;
    }


    //endregion

    //region Methodes

    @Override
    public void crier() {
        System.out.println("Meuuuuuuuuuuuuuuuuuuuuuuuuuuh");
    }

    @Override
    public String toString() {
        return "Vache : " +
                super.toString() +
                "\nestTachetee=" + estTachetee ;
    }

}
