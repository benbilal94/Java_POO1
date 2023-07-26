package demos.basicClass;

import demos.basicClass.interfaces.Customer;
import demos.exeption.ArgumentOutOfRangeException;
import demos.exeption.SoldeInsuffisantException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws ArgumentOutOfRangeException {


        Person p1 = new Person("Billy", "Wonka", LocalDate.of(1993, 12, 15));
        Courant c1 = new Courant("65526", p1, 1000);

        Banque banque = new Banque("Les voleurs");
        banque.ajouterCompte(c1);

        try {
            c1.depot(1000);
            banque.recupCompte("1").retrait(1000);
            banque.recupCompte("2").retrait(500);
        } catch (SoldeInsuffisantException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Customer customer = new Courant("3", p1);

        Position pos1 = new Position(5, 3);
        pos1.x();
        pos1.y();



    }

}