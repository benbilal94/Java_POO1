package demos.Collection.constructeurRecap.models;

public abstract class Herbivore extends Animal{
//    Attribut

    private String region;


//    Constructeurs

    public Herbivore(String name, int weight, int size , String paramRegion){
        super(name,weight,size);
        this.region = paramRegion;

    }


//    Propriété (getter et setter)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

//    Methodes


    @Override
    public String toString() {
        return super.toString() + "\nregion='" + region ;
    }

}
