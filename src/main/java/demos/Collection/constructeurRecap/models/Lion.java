package demos.Collection.constructeurRecap.models;

public class Lion extends Carnivore{

//    Attribut
    private String couleurCriniere;

//    Constructeur

    public Lion(String name, int weigth, int size , String paramCouleurCriniere){
        super(name,weigth,size);
        this.couleurCriniere = paramCouleurCriniere;
    }


//    Propriété (getter et setter)


//    Method

    @Override
    public void crier(){
        System.out.println("aaaaaaargh!");
    }

    @Override
    public String toString() {
        return "Lion : " +
                super.toString() +
                "\ncouleurCriniere='" + couleurCriniere ;
    }

}
