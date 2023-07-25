package demos.interfacsFonctioelles;

import demos.demoStatic.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Tintin"));
        movies.add(new Movie("Openheimer"));
        movies.add(new Movie("Inception"));
        movies.add(new Movie("Shutter island"));
        //region intro lambda
//
//        List<String> titles = new ArrayList<>();
//        for (Movie m : movies) {
//            titles.add(mapMovie(m));
//        }
//
//        System.out.println("________________________________________________");
////        titles = movies.stream()
////                                .map(m -> m.getTitle())
////                                .toList();
//
//        for (String s : titles) {
//            System.out.println(s);
//        }
//endregion

        //Avec une class impl
//        Command c1 = new CommandImplExemple();
//        c1.execute();
//
//        Command c2 = new Command() {
//            @Override
//            public void execute() {
//                System.out.println("Hello de la class anonyme");
//            }
//        };
//        c2.execute();
//
//        Command c3 = () -> System.out.println("Coucou je suis la super methode lambda");
//        c3.execute();
//        c3 = () -> System.out.println("Ils faut les utiliser");
//        c3.execute();
//        c3 = () -> System.out.println("Ca change la vie de dev!");
//        c3.execute();
//        c3 = () -> System.out.println("C'est super cool");
//        c3.execute();
//
//        FilterIFonct filter = m -> m.getTitle().equals("Tintin");
//
//        List<Movie> resultList;
//
//        resultList = filterMovie(filter);
//
//        resultList.forEach(m -> System.out.println(m));
//
//        System.out.println("__________________________________________________________");
//
//        resultList = filterMovie(m -> m.getId() == 2);
//        resultList.forEach(m -> System.out.println(m));

        Scanner scanner = new Scanner(System.in);

        Carwash carwash = new Carwash();
        Voiture v1 = new Voiture("1");

        System.out.println("Voulez vous preparer la voiture ?");
        if(scanner.nextBoolean()){
            carwash.addSubscriber(v -> System.out.println("Je traite la voiture " + v.getNumeroPlaque()));
        }
        System.out.println("Voulez vous laver la voiture ?");
        if(scanner.nextBoolean()){
            carwash.addSubscriber(v -> System.out.println("Je lave la voiture " + v.getNumeroPlaque()));
        }
        System.out.println("Voulez vous finaliser la voiture ?");
        if(scanner.nextBoolean()){
            carwash.addSubscriber(v -> System.out.println("Je finalise la voiture " + v.getNumeroPlaque()));
        }

        carwash.traiter(v1);
    }

    public static String mapMovie(Movie m) {
        return m.getTitle();
    }

    public static List<Movie> filterMovie(FilterIFonct predicate){
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Tintin"));
        movies.add(new Movie("Openheimer"));
        movies.add(new Movie("Inception"));
        movies.add(new Movie("Shutter island"));

        List<Movie> returnList = new ArrayList<>();

        for (Movie m : movies){
            if(predicate.execute(m)){
                returnList.add(m);
            }
        }
        return returnList;

//        return movies.stream()
//                .filter(m -> m.getTitle().equals("coucou")).toList();
    }
}