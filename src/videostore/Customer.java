package videostore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            result += "\t" + each.getMovie().getTitle() + '\t' + String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentPoints()) + " frequent renter points";

        return result;
    }
    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1>\n<P>";
        for(Rental each : rentals) {
            result += each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
        }
        result += "</P>\n<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM></P>\n";
        result += "<P>On this rental you earned: <EM>" + String.valueOf(getTotalFrequentPoints()) + "</EM> frequent renter points</P>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental each : rentals) {
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentPoints() {
        int result = 0;
        for (Rental each : rentals) {
            result += each.getFrequentPoints();
        }
        return result;
    }


}



