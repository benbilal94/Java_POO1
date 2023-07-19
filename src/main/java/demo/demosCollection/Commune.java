package demo.demosCollection;

public class Commune {
    private Integer codePostal;
    private String nom;
    private Integer nbHabitant;

    public Commune(Integer codePostal, String nom, Integer nbHabitant) {
        this.codePostal = codePostal;
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbHabitant() {
        return nbHabitant;
    }

    public void setNbHabitant(Integer nbHabitant) {
        this.nbHabitant = nbHabitant;
    }
}
