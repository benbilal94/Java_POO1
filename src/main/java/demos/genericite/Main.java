package demos.genericite;

import demos.basicClass.Person;
import demos.enums.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();

        BaseRepository<Person,Integer> repo;

        Person p = repo.get(5);

        BaseRepository<Book,String> repo2;

        Person p2 = repo2.get(5);
    }
}
