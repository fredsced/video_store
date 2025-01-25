package videostore;

public abstract class Price {

    abstract int getPrice();

    abstract double getCharge(int daysRented);

    int getFrequentPoint(int daysRented){
        return 1;
    }

}
