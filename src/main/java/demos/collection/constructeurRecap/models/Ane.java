package demos.collection.constructeurRecap.models;

public class Ane extends Herbivore{
    //region Attributs

    private boolean estTetu;

    //endregion

    //region Constructeurs

    public Ane(String name, int weight, int size, String paramRegion, boolean estTetu) {
        super(name, weight, size, paramRegion);
        this.estTetu = estTetu;
    }

    //endregion

    //region Propriétés

    public boolean isEstTetu() {
        return estTetu;
    }

    public void setEstTetu(boolean estTetu) {
        this.estTetu = estTetu;
    }


    //endregion

    //region Méthodes

    @Override
    public void crier() {
        System.out.println("Hihan");
    }

    @Override
    public String toString() {
        return "Ane : " +
                super.toString() +
                "\nestTetu=" + estTetu;
    }

    //endregion
}
