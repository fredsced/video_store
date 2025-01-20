import videostore.Customer;
import videostore.Movie;
import videostore.Rental;


public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Star War", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("John");

        customer.addRental(rental);

        System.out.println(customer.statement());
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(customer.htmlStatement());

    }
}