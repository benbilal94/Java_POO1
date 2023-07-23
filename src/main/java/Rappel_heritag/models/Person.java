package Rappel_heritag.models;

import java.text.MessageFormat;
import java.time.LocalDate;

public abstract class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = null;
    }

    public Person(String firstName,String lastName,LocalDate birthDate){
        this(firstName,lastName);
        this.birthDate = birthDate;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }

    public String getFullName(){
        // Getter calculer => n'est pas relier a un attribut de classe
        return MessageFormat.format("{0}{1}",getFirstName(),getLastName());
    }

    public abstract String eats(String meal);
    public String sleep(){
        return MessageFormat.format("{0}, sleeps!",getFullName());
    }
}
