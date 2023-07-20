package Rappel_heritag.models;

import java.time.LocalDate;

public class TrainingPath {

    // Champs - Fields (Attributes)

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private byte  nbStudent;

    // Consructeur


    public TrainingPath(String name, byte nbStudent) {
        if (nbStudent <= 0){
            throw new RuntimeException("Le nombre de stagiere dois etre positif");
        }
        this.name = name;
        this.nbStudent = nbStudent;
    }

    public TrainingPath(String name, LocalDate startDate, LocalDate endDate, byte nbStudent) {
        this(name,nbStudent);
        if (startDate.isAfter(endDate)){
            throw new RuntimeException("Date invalide");
        }

        this.startDate = startDate;
        this.endDate = endDate;
    }

//    Getter

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public byte getNbStudent() {
        return nbStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(LocalDate startDate) {
        if (startDate != null && endDate != null && !startDate.isBefore(endDate)){
            throw new RuntimeException("La date de debut doit etre avant la date de fin");
        }
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        if (startDate != null && endDate != null && !endDate.isAfter(startDate)){
            throw new RuntimeException("La date de fin doit etre apres la date de debut");
        }
        this.endDate = endDate;
    }

    public void setNbStudent(byte nbStudent) {
        if (nbStudent <= 0){
            throw new RuntimeException("Le nombre de stagiere dois etre positif");
        }
        this.nbStudent = nbStudent;
    }
}
