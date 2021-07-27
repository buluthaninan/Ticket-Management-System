package ticketManagementSystem;

public class Ticket implements Printable {
    private String Name;
    private String Surname;
    private String TC;
    private String TelNo;
    private int seatNumber;
    private DESTINATIONS destınatıon;
    private double price;

    public Ticket(String name, String surname, String TC, String telNo, int seatNumber, DESTINATIONS destınatıon, double price) {
        Name = name;
        Surname = surname;
        this.TC = TC;
        TelNo = telNo;
        this.seatNumber = seatNumber;
        this.destınatıon = destınatıon;
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.print("Name: "+Name);
        System.out.println();
        System.out.print("Surname: "+Surname);
        System.out.println();
        System.out.println("TC: "+TC);
        System.out.println("Tel No: "+TelNo);
        System.out.println("Seat Number: "+seatNumber);
        System.out.println("Price" +price);
    }
}
