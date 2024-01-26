public class TestAlbum {
    public static void main(String[] args) {
        Album[] albums = {
                new Album("Hotel California", "Eagles", Album.Genre.ROCK),
                new Album("Best of", "J.S. Bach", Album.Genre.CLASSICAL),
                new Album("Arrival", "ABBA", Album.Genre.POP),
                new Album("Hemma hos 1", "Janne & Kjell", Album.Genre.OTHER),
                new Album("White album", "Beatles", Album.Genre.POP),
                new Album("Best of", "Mozart", Album.Genre.CLASSICAL),
                new Album("Thank you for the music", "ABBA", Album.Genre.POP)
        };
        System.out.println("All albums exluding pop:");
        GenreFilter filterExcludePop = new FilterExcludePop();
        printAlbums(albums, filterExcludePop);

        System.out.println("\nAll pop albums:");
        GenreFilter filterIncludePopOnly = new FilterIncludePopOnly();
        printAlbums(albums, filterIncludePopOnly);
    }

    static void printAlbums(Album[] albums, GenreFilter genreFilter) {
        for (Album a : albums) {
            if (genreFilter.permit(a)) {
                System.out.println(" * " + a);
            }
        }
    }
}
