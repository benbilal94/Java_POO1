package demos.demoStatic;

public class Movie {
    public static int currentId = 1;
    private int id ;
    private String title;

    public Movie() {
       id = currentId++;
    }

    public Movie(String title) {
        this();
        this.title = title;
    }

    public int getCurrentId() {
        return currentId;
    }

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "currentId=" + currentId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
