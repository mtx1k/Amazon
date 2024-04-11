public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;

    public Movie() {

    }

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = "";
    }

    public Movie(String title, String director, MovieGenre genre, int price) {
       this(title, genre, price);
       this.director = director;
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
        System.out.println("Title: " + this.title);
        if (!director.isEmpty()) {
            System.out.println("Director: " + director);
        }
        System.out.println("Genre: " + this.genre);
        System.out.println("Price: " + this.price);
    }
}