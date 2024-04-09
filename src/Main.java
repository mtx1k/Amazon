public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book(), new Book()};
        books[0].setTitle("The Lord of the Rings. Boxed Set");
        books[0].setAuthor("J. R. R. Tolkien");
        books[0].setPrice(71);
        books[1].setTitle("Harry Potter. Boxed Set");
        books[1].setAuthor("J. K. Rowling");
        books[1].setPrice(56);

        System.out.println("Books: ");
        for (int i = 0; i < books.length; i++) {
            printBookDetails(books[i]);
        }

        System.out.println();
        Movie[] movies = {new Movie(), new Movie()};
        movies[0].title = "Der Herr der Ringe: Extended Edition Trilogie";
        movies[0].genre = MovieGenre.FANTASY;
        movies[0].price = 25;
        movies[1].title = "Allein zu Haus";
        movies[1].genre = MovieGenre.COMEDY;
        movies[1].price = 8;

        System.out.println("Movies: ");
        for (Movie movie : movies) {
            printMovieDetails(movie);
        }
    }
    public static void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle() + "\n"
                + "Author: " + book.getAuthor() + "\n"
                + "Price: " + book.getPrice());
    }
    public static void printMovieDetails(Movie movie) {
        System.out.println("Title: " + movie.title + "\n"
                + "Genre: " + movie.genre + "\n"
                + "Price: " + movie.price);
    }
}