public class Main {
    public static void main(String[] args) {
//        Book[] books = {new Book(), new Book()};
//        books[0].setTitle("The Lord of the Rings. Boxed Set");
//        books[0].setAuthor("J. R. R. Tolkien");
//        books[0].setPrice(71);
//        books[1].setTitle("Harry Potter. Boxed Set");
//        books[1].setAuthor("J. K. Rowling");
//        books[1].setPrice(56);
        Book lordOfTheRings = new Book("Lord of the Rings", "JRR Tolkien", 400);
        Book harryPotter = new Book("Harry Potter", "JK Rowling", 200);

        System.out.println("Books: ");
//        for (int i = 0; i < books.length; i++) {
//            books[i].printBookDetails();
//        }
        lordOfTheRings.printBookDetails();
        harryPotter.printBookDetails();

        System.out.println();
//        Movie[] movies = {new Movie(), new Movie()};
//        movies[0].setTitle("Der Herr der Ringe: Extended Edition Trilogie");
//        movies[0].setGenre(MovieGenre.FANTASY);
//        movies[0].setPrice(25);
//        movies[1].setTitle("Allein zu Haus");
//        movies[1].setGenre(MovieGenre.COMEDY);
//        movies[1].setPrice(8);

        System.out.println("Movies: ");
        Movie herrDerRinge = new Movie("Der Herr der Ringe", MovieGenre.FANTASY, 100);
        Movie alleinZuHaus = new Movie("Allein zu Haus", MovieGenre.COMEDY, 20);
//        for (Movie movie : movies) {
//            movie.printMovieDetails();
//        }
        herrDerRinge.printMovieDetails();
        alleinZuHaus.printMovieDetails();
    }
//    public static void printBookDetails(Book book) {
//        System.out.println("Title: " + book.getTitle() + "\n"
//                + "Author: " + book.getAuthor() + "\n"
//                + "Price: " + book.getPrice());
//    }
//    public static void printMovieDetails(Movie movie) {
//        System.out.println("Title: " + movie.getTitle() + "\n"
//                + "Genre: " + movie.getGenre() + "\n"
//                + "Price: " + movie.getPrice());
//    }
}