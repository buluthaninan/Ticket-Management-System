package ticketManagementSystem;

import java.util.ArrayList;

public class İstanbul extends DESTINATIONS implements Printable {
    ArrayList<Customer> seats = new ArrayList<>();

    public void displayCustomerInfo(){}
    @Override
    public void displayInfo() {
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i) != null)
                seats.get(i).displayCustomerInfo();
        }

        System.out.println("number of full seats: "+ seats.size());

    }

    public İstanbul(ArrayList<Customer> seats) {
        super(seats);
    }

    public İstanbul() {
        this.seats =  new ArrayList<>();


    }

    @Override
    public ArrayList<Customer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Customer> seats) {
        this.seats = seats;
    }
}