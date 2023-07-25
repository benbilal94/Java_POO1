package demos.interfaces;

import demos.demoStatic.Movie;

public class ServiceCrud {

    private Crud crud;

    public ServiceCrud(Crud crud) {
        this.crud = crud;
    }

    public  void add(Movie m){
        crud.delete(3);
        crud.create(m);
    }
}
