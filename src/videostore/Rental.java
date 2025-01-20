package videostore;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
       return movie.getCharge(getDaysRented());
    }

    public int getFrequentPoints() {
       return movie.getFrequentPoint(getDaysRented());
    }

}
