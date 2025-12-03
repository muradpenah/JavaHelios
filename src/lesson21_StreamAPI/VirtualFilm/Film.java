package lesson21_StreamAPI.VirtualFilm;

public class Film {
    private  String title;
    private  String director;
    private  String genre;
    private  int releaseYear;
    private  double rating;

    // Constructor
    public Film(String title, String director, String genre, int releaseYear, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public double getRating() { return rating; }

    // Debugging üçün toString metodu
    @Override
    public String toString() {
        return String.format("%s (%d) | Reytinq: %.1f | Janr: %s",
                title, releaseYear, rating, genre);
    }
}
