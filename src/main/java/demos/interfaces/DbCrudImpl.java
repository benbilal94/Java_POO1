package demos.interfaces;

import demos.demoStatic.Movie;

import java.util.List;

public class DbCrudImpl implements Crud{
    @Override
    public void create(Movie m) {

    }

    @Override
    public Movie readOne(int id) {
        return null;
    }

    @Override
    public List<Movie> readAll() {
        return null;
    }

    @Override
    public boolean update(int id, Movie newMovie) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
