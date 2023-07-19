package demos.heritage;

public class Vehicule {

    private String modele;
    private String marque;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void seDeplacer() {
        System.out.println("Je me deplace");
    }

    @Override
    public String toString() {
        return "modele='" + modele + '\'' +
                ", marque='" + marque + '\'';
    }
}
