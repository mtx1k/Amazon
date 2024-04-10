public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;

    public Movie() {

    }

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printMovieDetails() {
        System.out.println("Title: " + this.title + "\n"
                + "Genre: " + this.genre + "\n"
                + "Price: " + this.price);
    }
}