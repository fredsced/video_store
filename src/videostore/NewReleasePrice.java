package videostore;

public class NewReleasePrice extends Price {

    @Override
    int getPrice() {
        return Movie.NEW_RELEASE;
    }
    @Override
    double getCharge(int daysRented){
        return daysRented * 3;
    }
    @Override
    int getFrequentPoint(int daysRented){
        return (daysRented > 1) ? 2 : 1;
    }

}
