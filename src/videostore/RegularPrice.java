package videostore;

public class RegularPrice extends Price {
    @Override
    int getPrice() {
        return Movie.REGULAR;
    }
}
