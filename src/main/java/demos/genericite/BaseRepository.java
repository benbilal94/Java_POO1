package demos.genericite;

import demos.collection.constructeurRecap.models.Animal;
import demos.basicClass.Person;
import demos.enums.Book;

public interface BaseRepository<TEntity extends Animal,TId> {

    TEntity get (TId id);
}
