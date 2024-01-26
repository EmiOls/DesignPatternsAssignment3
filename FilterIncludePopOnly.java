public class FilterIncludePopOnly implements GenreFilter{

    @Override
    public boolean permit(Album a) {
        return a.genre().equalsIgnoreCase(Album.Genre.POP.name());
    }
    
}
