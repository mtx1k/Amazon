public class Main {
    public static void main(String[] args) {
        Book[] books = {new Book(), new Book()};
        books[0].title = "The Lord of the Rings. Boxed Set";
        books[0].author = "J. R. R. Tolkien";
        books[0].price = 71;
        books[1].title = "Harry Potter. Boxed Set";
        books[1].author = "J. K. Rowling";
        books[1].price = 56;

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
        System.out.println("Title: " + book.title + "\n"
                + "Author: " + book.author + "\n"
                + "Price: " + book.price);
    }
    public static void printMovieDetails(Movie movie) {
        System.out.println("Title: " + movie.title + "\n"
                + "Genre: " + movie.genre + "\n"
                + "Price: " + movie.price);
    }
}