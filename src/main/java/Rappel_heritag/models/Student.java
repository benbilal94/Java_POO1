package Rappel_heritag.models;

import java.security.SecureRandom;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Random;

public class Student extends Person {
    private Random rng;

    public Student(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
        rng = new SecureRandom();
    }

    @Override
    public String eats(String meal) {
        if (rng.nextBoolean()) {
            return MessageFormat.format("{0} mange {1}", getFullName(), meal);
        }
        return MessageFormat.format("{0} you can order what you like at the fast-food", getFullName());
    }

}
