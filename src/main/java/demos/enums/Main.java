package demos.enums;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("1","Tintin",GenreLitteraire.COMEDIE);

        GenreLitteraire genreLitteraire = GenreLitteraire.DRAME;

        String genre = genreLitteraire.toString();
        int ordinal = genreLitteraire.ordinal();

        System.out.println(ordinal);

        GenreLitteraire genreLitteraireResultString = GenreLitteraire.valueOf(genre);
        GenreLitteraire genreLitteraireResultOrdinal = GenreLitteraire.values()[ordinal];

        for(GenreLitteraire g : GenreLitteraire.values()){

            String s = g.toString();
            int o = g.ordinal();
            System.out.println(g);
        }


        Dice dice = Dice.D6;

        dice.rolls(5,3);

        Dice.D100.roll();

    }
}
