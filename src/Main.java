import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Lord of the Rings", "JRR Tolkien", 400));
        books.add(new Book("Harry Potter", "JK Rowling", 200));
        System.out.println("Books: ");
        for (Book book : books) {
            book.printBookDetails();
        }
        System.out.println();

        System.out.println("Movies: ");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Der Herr der Ringe", MovieGenre.FANTASY, 100));
        movies.add(new Movie("Allein zu Haus", MovieGenre.COMEDY, 20));
        movies.add(new Movie("The Matrix", "Vachovsky Brs.", MovieGenre.ACTION, 50));
        for (Movie movie : movies) {
            movie.printMovieDetails();
        }
    }
}