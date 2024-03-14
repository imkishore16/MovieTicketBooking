import java.util.*;

public class Movie {
    // pk
    private String title;
    private String duration;
    private String director;
    private Genre genre;
    private int ratings;
    private List<String> reviews;

    public Movie(){}
    public Movie(String title,String duration,String director,Genre genre){
        this.setReviews(new ArrayList<>());
        this.setRatings(0);
        this.setReviews(new ArrayList<>());
        this.title=title;
        this.duration=duration;
        this.director=director;
        this.genre=genre;
    }

    //important functions
    public void addRating(){}
    public void calculateRatings(){}











    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }


    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }
}
