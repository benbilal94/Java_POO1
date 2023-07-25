package demos.demoStatic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static demos.demoStatic.MoneyConverter.Converter.dollarToEuro;
import static demos.demoStatic.MoneyConverter.Converter.euroToDollar;

public class Main {
    public static void main(String[] args) {

        double euro = 42;
        System.out.println(euro + "€");
        double dollar = euroToDollar(100);
        euro = dollarToEuro(dollar);

        System.out.println(dollar + "$");
        System.out.println(euro + "€");


        Movie m1 = new Movie("Gladiator");
        Movie m2 = new Movie("Shutter Iland");
        Movie m3 = new Movie("Taxi 3");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println(Movie.currentId);

        int res = Des.lancerDe(6,5,3);
        System.out.println(res);

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Shutter Island"));
        movies.add(new Movie(" Inception"));
        movies.add(new Movie("Tintin"));

        List<String> titles = movies.stream()
                .map(m -> m.getTitle())
                .toList();

    }

}
