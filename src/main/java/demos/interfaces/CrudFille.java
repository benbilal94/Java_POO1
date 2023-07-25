package demos.interfaces;

import demos.demoStatic.Movie;

public interface CrudFille extends Crud{

    Movie getByTitle(String title);
}
