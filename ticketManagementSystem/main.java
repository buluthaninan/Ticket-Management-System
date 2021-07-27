package ticketManagementSystem;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ilktercih;
        int ikincitercih;
        int yolcusayisi;
        String tempName;
        String tempSurname;
        String tempTC;
        String tempTelNo;
        int tempseatNumber;
        Customer customer;

        menü m = new menü();
        System.out.println("Welcome to our ticket system.These informations will only use if you select the Be a Member choice.");
        System.out.println("Otherwise your informations will be deleted immediately.");
        System.out.println();
        System.out.println("PS:If you be a member and then buy a ticket as a member you will be awarded with an special discount.");



        boolean isTrue = false;

        do {

            System.out.println("enter name: ");
            tempName = in.next();
            System.out.println("enter surname: ");
            tempSurname = in.next();
            System.out.println("enter TC: ");
            tempTC = in.next();
            System.out.println("enter tel NO: ");
            tempTelNo = in.next();
            customer = new Customer(tempName,tempSurname,tempTC,tempTelNo);



            if(!ValidateInput.validateFirstName(tempName))
            {
                System.out.println("INVALID FIRST NAME");
                isTrue=false;


            }
            if(!ValidateInput.validateLastName(tempSurname))
            {
                System.out.println("INVALID LAST NAME");
                isTrue=false;

            }

            if(!ValidateInput.validatePhoneNumber(tempTelNo))
            {
                System.out.println("INVALID PHONE NUMBER");
                isTrue=false;

            }



            if(!ValidateInput.validateTC(tempTC))
            {
                System.out.println("INVALID TC");
                isTrue=false;

            }


            if(ValidateInput.validateFirstName(tempName) && ValidateInput.validateLastName(tempSurname) && ValidateInput.validatePhoneNumber(tempTelNo) && ValidateInput.validatePhoneNumber(tempTelNo) && ValidateInput.validateTC(tempTC) )
            {
                System.out.println("valid");
                isTrue=true;
                break;
            }
        }while(isTrue==false);


        while (true) {

            m.displaymenü();
            ilktercih = in.nextInt();
            switch (ilktercih) {
                case 1:

                    m.buyAsMember(customer);
                    break;
                case 2:

                    m.buyAsGuest(customer);
                    break;
                case 3:
                    m.makeMember(customer);
                    break;
                case 4:
                    m.displayTicket(customer);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid entry. Please enter again: ");
                    break;

            }
        }
    }
}