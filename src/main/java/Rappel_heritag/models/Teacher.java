package Rappel_heritag.models;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Teacher extends Person{
    private String course;
    private void initialize(){
        this.course = course;
    }

    public Teacher(String firstName,String lastName,String course){
        super(firstName,lastName);
        initialize();
    }

    public Teacher(String firstName, String lastName, LocalDate birthDate,String course){
        super(firstName,lastName,birthDate);
        initialize();
    }

    @Override
    public String eats(String meal){
        return MessageFormat.format("{0} eats {1}",getFirstName(),meal);
    }
}
