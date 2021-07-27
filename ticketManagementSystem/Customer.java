package ticketManagementSystem;



import java.util.ArrayList;

public class Customer extends DESTINATIONS {
    private String Name;
    private String Surname;
    private String TC;
    private String TelNo;
    private int seatNumber;
    private Ticket ticket;
    private ArrayList<Customer> additionalCustomers;

    public Customer(String name, String surname, String TC, String telNo,int seatNumber) {
        Name = name;
        Surname = surname;
        this.TC = TC;
        TelNo = telNo;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String telNo) {
        TelNo = telNo;
    }

    @Override
    public void displayCustomerInfo(){
        System.out.print("Name: "+Name);
        System.out.print("Surname: "+Surname);
        System.out.println("TC: "+TC);
        System.out.println("Tel No: "+TelNo);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println();
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void displayTicketInfo(){
        ticket.displayInfo();
    }

    public Customer() {
    }
    public Customer(String name, String surname, String TC, String telNo) {
        Name = name;
        Surname = surname;
        this.TC = TC;
        TelNo = telNo;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ArrayList<Customer> getAdditionalCustomers() {
        return additionalCustomers;
    }

    public void setAdditionalCustomers(ArrayList<Customer> additionalCustomers) {
        this.additionalCustomers = additionalCustomers;
    }
}