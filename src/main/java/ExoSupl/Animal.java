package ExoSupl;

public abstract class Animal {
    private String nom;
    private String typeAnimal;
    private int pattes;

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public int getPattes() {
        return pattes;
    }

    public void setPattes(int pattes) {
        this.pattes = pattes;
    }

    public void scream(){
        System.out.println("Attendons de voir");
    }
}
