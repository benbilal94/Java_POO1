package demos.enums;

public class Book {

    private String isbn;
    private String titre;
    private GenreLitteraire genre;


    public Book(String isbn, String titre, GenreLitteraire genre) {
        this.isbn = isbn;
        this.titre = titre;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
