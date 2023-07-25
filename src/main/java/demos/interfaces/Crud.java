package demos.interfaces;

import demos.demoStatic.Movie;

import java.util.List;

 public interface Crud {
    void create(Movie m);
     Movie readOne(int id);
     List<Movie> readAll();
     boolean update(int id ,Movie newMovie);
     boolean delete(int id);
}
