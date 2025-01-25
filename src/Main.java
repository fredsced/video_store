import videostore.Customer;
import videostore.Movie;
import videostore.Rental;


public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Star War", 1);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("John");


        customer.addRental(rental);

        System.out.println(customer.statement());
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(customer.htmlStatement());

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("---------WHEN STAR WAR BECOME REGULAR---------------------");
        movie.setPriceCode(0);
        System.out.println(customer.statement());



    }
}