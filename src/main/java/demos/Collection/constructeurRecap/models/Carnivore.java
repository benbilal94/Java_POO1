package demos.Collection.constructeurRecap.models;

public abstract class Carnivore extends Animal{
    //region Attributs

    private final boolean estNocturne;

    //endregion

    //region constructeur

    public Carnivore(String name,int weight, int size){
//        super(name,weight,size);
//        this.estNocturne = false;
        this(name,weight,size,false);
    }
    //Surcharge (overload) de constructeur
    public Carnivore(String name,int weight, int size, boolean paramEstNocturne){
        super(name,weight,size);
        this.estNocturne = paramEstNocturne;
    }

    //endregion

    //region Propriétés

    public boolean isEstNocturne() {
        return estNocturne;
    }


    //endregion

    //region Méthode

    @Override
    public String toString() {
        return super.toString() + "\nestNocturne=" + estNocturne;
    }


    //endregion

}
