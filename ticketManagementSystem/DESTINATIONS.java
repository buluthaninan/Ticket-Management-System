package ticketManagementSystem;
import java.util.ArrayList;


public abstract class DESTINATIONS {

    public abstract void displayCustomerInfo();

   protected ArrayList<Customer> seats;


    public ArrayList<Customer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Customer> seats) {
        this.seats = seats;
    }

    public DESTINATIONS(ArrayList<Customer> seats) {
        this.seats = seats;

    }

    public DESTINATIONS() {
        this.seats =new ArrayList<>();

    }
}