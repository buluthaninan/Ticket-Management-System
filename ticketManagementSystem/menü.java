package ticketManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class menü {
    Scanner in = new Scanner(System.in);


    DESTINATIONS ankara = new Ankara();
    DESTINATIONS istanbul = new İstanbul();
    DESTINATIONS antalya = new Antalya();
    ArrayList<Customer> members = new ArrayList<>();
    int tempseatNumber;

    String tempTC;
    String tempTelNo;


    public boolean searchForSeat(DESTINATIONS destınatıon, int seat){

        if(!destınatıon.seats.isEmpty()){

        for(int i=0;i<destınatıon.seats.size();i++){
            if(destınatıon.seats.get(i)!= null){
            if (destınatıon.seats.get(i).getSeatNumber()==seat){
                return true;
            }
        }}
        return false;
    }
        else
        return false;
    }


    public void displaymenü() {
        System.out.println("Welcome to the ticket system.Please select your choice.");
        System.out.println("1-Buy ticket as a member");
        System.out.println("2-Buy ticket as a guest");
        System.out.println("3-Be a member");
        System.out.println("4-Display ticket");
        System.out.println("0-Exit");
    }
    public int displaydest(){
        System.out.println("----DESTINATIONS----");
        System.out.println("1-İzmir-Ankara Plane (81 seat) 250TL ");
        System.out.println("2-İzmir-İstanbul Bus (62 seat) 100 TL ");
        System.out.println("3-İzmir-Antalya Plane (81 seat) 300 TL");
        int choice = in.nextInt();
        if(choice == 1){
            return 1;
        }
        else if(choice == 2){
            return 2;
        }
        else if (choice ==3){
            return 3;
        }
        else
            return 0;
    }



    public ArrayList<Customer> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Customer> members) {
        this.members = members;
    }

    public void makeMember(Customer customer){
        System.out.println("Wait just a second.");
        members.add(customer);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        System.out.println("you are a member now "+customer.getName());
    }

    public void buyAsMember(Customer customer){
        if(members.contains(customer)){
            System.out.println("Hello "+customer.getName());
            System.out.println("please choose a destination from below: ");
            int choice = displaydest();
            if(choice == 1){
                System.out.println("you have selected Ankara");

                System.out.println("Enter the passenger number:");
                int yolcusayisi=in.nextInt();

                for(int i=0;i<yolcusayisi;i++){
                    if(i>0){
                        Customer addCustomer=new Customer();
                        boolean flag2 = true;
                        while(flag2){
                    System.out.println("Enter seat number:");
                    tempseatNumber=in.nextInt();
                    boolean döngü3=true;
                    while(döngü3){
                        if(ankara.seats.size()>81){
                            System.out.println("all seats are full.");
                            displaydest();
                            choice=in.nextInt();
                        }
                        else if(searchForSeat(ankara,tempseatNumber)){
                            System.out.println("seat "+tempseatNumber+" is full.");
                            döngü3=false;

                        }
                        else {
                            System.out.println("Taking the seat please wait.");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                            addCustomer.setSeatNumber(tempseatNumber);
                            ankara.seats.add(addCustomer);

                            döngü3=false;
                            flag2 = false;

                        }
                    }}


                    System.out.println("Enter name:");
                    String tempName=in.next();
                    addCustomer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    addCustomer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                         tempTC = in.next();

                        if (tempTC.length()==11) {
                            addCustomer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                         tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                           addCustomer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                   addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,ankara,250));
                    }
                    else{

                        System.out.println("Enter seat number:");
                        int tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(ankara.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            if(searchForSeat(ankara,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                displaydest();
                                break;
                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                customer.setSeatNumber(tempseatNumber);
                                ankara.seats.add(customer);//Run time poly

                                döngü3=false;
                            }
                        }

                        System.out.println("Enter name:");
                        String tempName=in.next();
                        customer.setName(tempName);

                        System.out.println("Enter surname:");
                        String tempSurname=in.next();
                        customer.setSurname(tempSurname);

                        boolean döngü = true;
                        while (döngü) {
                            System.out.println("Enter TC No:");
                            tempTC = in.next();

                            if (tempTC.length()==11) {
                                customer.setTC(tempTC);
                                döngü=false;
                            }
                        }
                        boolean döngü2 = true;
                        while (döngü2) {
                            System.out.println("Tel No:(without 0)");
                            tempTelNo = in.next();
                            if (tempTelNo.length() == 10) {
                                customer.setTelNo(tempTelNo);
                                döngü2 = false;
                            }
                        }
                        customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,ankara,250*yolcusayisi-10));
                    }
                }
            }
            if(choice == 2){
                System.out.println("you have selected İstanbul");

                System.out.println("Enter the passenger number:");
                int yolcusayisi=in.nextInt();

                for(int i=0;i<yolcusayisi;i++){
                    if(i>0){
                        Customer addCustomer=new Customer();
                        boolean flag2 = true;
                        while(flag2){
                            System.out.println("Enter seat number:");
                            tempseatNumber=in.nextInt();
                            boolean döngü3=true;
                            while(döngü3){
                                if(istanbul.seats.size()>81){
                                    System.out.println("all seats are full.");
                                    displaydest();
                                    choice=in.nextInt();
                                }
                                else if(searchForSeat(istanbul,tempseatNumber)){
                                    System.out.println("seat "+tempseatNumber+" is full.");
                                    döngü3=false;

                                }
                                else {
                                    System.out.println("Taking the seat please wait.");
                                    try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                                    addCustomer.setSeatNumber(tempseatNumber);
                                    istanbul.seats.add(addCustomer);

                                    döngü3=false;
                                    flag2 = false;

                                }
                            }}


                        System.out.println("Enter name:");
                        String tempName=in.next();
                        addCustomer.setName(tempName);

                        System.out.println("Enter surname:");
                        String tempSurname=in.next();
                        addCustomer.setSurname(tempSurname);

                        boolean döngü = true;
                        while (döngü) {
                            System.out.println("Enter TC No:");
                            tempTC = in.next();

                            if (tempTC.length()==11) {
                                addCustomer.setTC(tempTC);
                                döngü=false;
                            }
                        }
                        boolean döngü2 = true;
                        while (döngü2) {
                            System.out.println("Tel No:(without 0)");
                            tempTelNo = in.next();
                            if (tempTelNo.length() == 10) {
                                addCustomer.setTelNo(tempTelNo);
                                döngü2 = false;
                            }
                        }
                        addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,istanbul,250));
                    }
                    else{

                        System.out.println("Enter seat number:");
                        int tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(ankara.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            if(searchForSeat(istanbul,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                displaydest();
                                break;
                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                customer.setSeatNumber(tempseatNumber);
                                istanbul.seats.add(customer);

                                döngü3=false;
                            }
                        }

                        System.out.println("Enter name:");
                        String tempName=in.next();
                        customer.setName(tempName);

                        System.out.println("Enter surname:");
                        String tempSurname=in.next();
                        customer.setSurname(tempSurname);

                        boolean döngü = true;
                        while (döngü) {
                            System.out.println("Enter TC No:");
                            tempTC = in.next();

                            if (tempTC.length()==11) {
                                customer.setTC(tempTC);
                                döngü=false;
                            }
                        }
                        boolean döngü2 = true;
                        while (döngü2) {
                            System.out.println("Tel No:(without 0)");
                            tempTelNo = in.next();
                            if (tempTelNo.length() == 10) {
                                customer.setTelNo(tempTelNo);
                                döngü2 = false;
                            }
                        }
                        customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,istanbul,250*yolcusayisi-10));
                    }
                }
            }
            if(choice == 3){
                System.out.println("you have selected Antalya");

                System.out.println("Enter the passenger number:");
                int yolcusayisi=in.nextInt();

                for(int i=0;i<yolcusayisi;i++){
                    if(i>0){
                        Customer addCustomer=new Customer();
                        boolean flag2 = true;
                        while(flag2){
                            System.out.println("Enter seat number:");
                            tempseatNumber=in.nextInt();
                            boolean döngü3=true;
                            while(döngü3){
                                if(antalya.seats.size()>81){
                                    System.out.println("all seats are full.");
                                    displaydest();
                                    choice=in.nextInt();
                                }
                                else if(searchForSeat(antalya,tempseatNumber)){
                                    System.out.println("seat "+tempseatNumber+" is full.");
                                    döngü3=false;

                                }
                                else {
                                    System.out.println("Taking the seat please wait.");
                                    try{
                                        Thread.sleep(2000);
                                    }catch(InterruptedException e){}
                                    addCustomer.setSeatNumber(tempseatNumber);
                                    antalya.seats.add(addCustomer);

                                    döngü3=false;
                                    flag2 = false;

                                }
                            }}


                        System.out.println("Enter name:");
                        String tempName=in.next();
                        addCustomer.setName(tempName);

                        System.out.println("Enter surname:");
                        String tempSurname=in.next();
                        addCustomer.setSurname(tempSurname);

                        boolean döngü = true;
                        while (döngü) {
                            System.out.println("Enter TC No:");
                            tempTC = in.next();

                            if (tempTC.length()==11) {
                                addCustomer.setTC(tempTC);
                                döngü=false;
                            }
                        }
                        boolean döngü2 = true;
                        while (döngü2) {
                            System.out.println("Tel No:(without 0)");
                            tempTelNo = in.next();
                            if (tempTelNo.length() == 10) {
                                addCustomer.setTelNo(tempTelNo);
                                döngü2 = false;
                            }
                        }
                        addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,antalya,250));
                    }
                    else{

                        System.out.println("Enter seat number:");
                        int tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(ankara.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            if(searchForSeat(antalya,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                displaydest();
                                break;
                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                customer.setSeatNumber(tempseatNumber);
                                antalya.seats.add(customer);

                                döngü3=false;
                            }
                        }

                        System.out.println("Enter name:");
                        String tempName=in.next();
                        customer.setName(tempName);

                        System.out.println("Enter surname:");
                        String tempSurname=in.next();
                        customer.setSurname(tempSurname);

                        boolean döngü = true;
                        while (döngü) {
                            System.out.println("Enter TC No:");
                            tempTC = in.next();

                            if (tempTC.length()==11) {
                                customer.setTC(tempTC);
                                döngü=false;
                            }
                        }
                        boolean döngü2 = true;
                        while (döngü2) {
                            System.out.println("Tel No:(without 0)");
                            tempTelNo = in.next();
                            if (tempTelNo.length() == 10) {
                                customer.setTelNo(tempTelNo);
                                döngü2 = false;
                            }
                        }
                        customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,antalya,250*yolcusayisi-10));
                    }
                }
            }




        }

        else{
            System.out.println("You are not a member");
            System.out.println("returning to menu...");

        }
    }//method end



    public void displayTicket(Customer customer){
        boolean flag1 = true;
       while(flag1){
        System.out.println("enter seat number: ");
        tempseatNumber = in.nextInt();
        System.out.println("enter destination: ");
        String tempDest = in.next();
        if (tempDest.equalsIgnoreCase("ankara")) {
            for(int i= 0 ;i<ankara.seats.size();i++){

                if(ankara.seats.get(i).getSeatNumber()==tempseatNumber){
                    ankara.seats.get(i).displayTicketInfo();
                flag1= false;
                break;
                }



            }

        }
           if (tempDest.equalsIgnoreCase("istanbul")) {
               for(int i= 0 ;i<istanbul.seats.size();i++){

                   if(istanbul.seats.get(i).getSeatNumber()==tempseatNumber){
                       System.out.println("Getting the seat please wait.");
                       try{
                           Thread.sleep(2000);
                       }catch(InterruptedException e){}
                       istanbul.seats.get(i).displayTicketInfo();
                       flag1= false;
                       break;
                   }



               }

           }
           if (tempDest.equalsIgnoreCase("antalya")) {
               for(int i= 0 ;i<antalya.seats.size();i++){

                   if(antalya.seats.get(i).getSeatNumber()==tempseatNumber){
                       System.out.println("Getting the seat please wait.");
                       try{
                           Thread.sleep(2000);
                       }catch(InterruptedException e){}
                       antalya.seats.get(i).displayTicketInfo();
                       flag1= false;
                       break;
                   }



               }

           }

           if (flag1){
               System.out.println("We could not find SeatNumber");
               flag1 = false;
           }

    }
    }

    public void buyAsGuest(Customer customer){
        System.out.println("Hello "+customer.getName());
        System.out.println("please choose a destination from below: ");
        int choice = displaydest();
        if(choice == 1){
            System.out.println("you have selected Ankara");

            System.out.println("Enter the passenger number:");
            int yolcusayisi=in.nextInt();

            for(int i=0;i<yolcusayisi;i++){
                if(i>0){
                    Customer addCustomer=new Customer();
                    boolean flag2 = true;
                    while(flag2){
                        System.out.println("Enter seat number:");
                        tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(ankara.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            else if(searchForSeat(ankara,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                döngü3=false;

                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                addCustomer.setSeatNumber(tempseatNumber);
                                ankara.seats.add(addCustomer);

                                döngü3=false;
                                flag2 = false;

                            }
                        }}


                    System.out.println("Enter name:");
                    String tempName=in.next();
                    addCustomer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    addCustomer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            addCustomer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            addCustomer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,ankara,250));
                }
                else{

                    System.out.println("Enter seat number:");
                    int tempseatNumber=in.nextInt();
                    boolean döngü3=true;
                    while(döngü3){
                        if(ankara.seats.size()>81){
                            System.out.println("all seats are full.");
                            displaydest();
                            choice=in.nextInt();
                        }
                        if(searchForSeat(ankara,tempseatNumber)){
                            System.out.println("seat "+tempseatNumber+" is full.");
                            displaydest();
                            break;
                        }
                        else {
                            System.out.println("Taking the seat please wait.");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                            customer.setSeatNumber(tempseatNumber);
                            ankara.seats.add(customer);//Run time poly

                            döngü3=false;
                        }
                    }

                    System.out.println("Enter name:");
                    String tempName=in.next();
                    customer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    customer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            customer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            customer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,ankara,250*yolcusayisi-10));
                }
            }
        }
        if(choice == 2){
            System.out.println("you have selected İstanbul");

            System.out.println("Enter the passenger number:");
            int yolcusayisi=in.nextInt();

            for(int i=0;i<yolcusayisi;i++){
                if(i>0){
                    Customer addCustomer=new Customer();
                    boolean flag2 = true;
                    while(flag2){
                        System.out.println("Enter seat number:");
                        tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(istanbul.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            else if(searchForSeat(istanbul,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                döngü3=false;

                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                addCustomer.setSeatNumber(tempseatNumber);
                                istanbul.seats.add(addCustomer);

                                döngü3=false;
                                flag2 = false;

                            }
                        }}


                    System.out.println("Enter name:");
                    String tempName=in.next();
                    addCustomer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    addCustomer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            addCustomer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            addCustomer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,istanbul,250));
                }
                else{

                    System.out.println("Enter seat number:");
                    int tempseatNumber=in.nextInt();
                    boolean döngü3=true;
                    while(döngü3){
                        if(ankara.seats.size()>81){
                            System.out.println("all seats are full.");
                            displaydest();
                            choice=in.nextInt();
                        }
                        if(searchForSeat(istanbul,tempseatNumber)){
                            System.out.println("seat "+tempseatNumber+" is full.");
                            displaydest();
                            break;
                        }
                        else {
                            System.out.println("Taking the seat please wait.");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                            customer.setSeatNumber(tempseatNumber);
                            istanbul.seats.add(customer);

                            döngü3=false;
                        }
                    }

                    System.out.println("Enter name:");
                    String tempName=in.next();
                    customer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    customer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            customer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            customer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,istanbul,250*yolcusayisi-10));
                }
            }
        }
        if(choice == 3){
            System.out.println("you have selected Antalya");

            System.out.println("Enter the passenger number:");
            int yolcusayisi=in.nextInt();

            for(int i=0;i<yolcusayisi;i++){
                if(i>0){
                    Customer addCustomer=new Customer();
                    boolean flag2 = true;
                    while(flag2){
                        System.out.println("Enter seat number:");
                        tempseatNumber=in.nextInt();
                        boolean döngü3=true;
                        while(döngü3){
                            if(antalya.seats.size()>81){
                                System.out.println("all seats are full.");
                                displaydest();
                                choice=in.nextInt();
                            }
                            else if(searchForSeat(antalya,tempseatNumber)){
                                System.out.println("seat "+tempseatNumber+" is full.");
                                döngü3=false;

                            }
                            else {
                                System.out.println("Taking the seat please wait.");
                                try{
                                    Thread.sleep(2000);
                                }catch(InterruptedException e){}
                                addCustomer.setSeatNumber(tempseatNumber);
                                antalya.seats.add(addCustomer);

                                döngü3=false;
                                flag2 = false;

                            }
                        }}


                    System.out.println("Enter name:");
                    String tempName=in.next();
                    addCustomer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    addCustomer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            addCustomer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            addCustomer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    addCustomer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,antalya,250));
                }
                else{

                    System.out.println("Enter seat number:");
                    int tempseatNumber=in.nextInt();
                    boolean döngü3=true;
                    while(döngü3){
                        if(ankara.seats.size()>81){
                            System.out.println("all seats are full.");
                            displaydest();
                            choice=in.nextInt();
                        }
                        if(searchForSeat(antalya,tempseatNumber)){
                            System.out.println("seat "+tempseatNumber+" is full.");
                            displaydest();
                            break;
                        }
                        else {
                            System.out.println("Taking the seat please wait.");
                            try{
                                Thread.sleep(2000);
                            }catch(InterruptedException e){}
                            customer.setSeatNumber(tempseatNumber);
                            antalya.seats.add(customer);

                            döngü3=false;
                        }
                    }

                    System.out.println("Enter name:");
                    String tempName=in.next();
                    customer.setName(tempName);

                    System.out.println("Enter surname:");
                    String tempSurname=in.next();
                    customer.setSurname(tempSurname);

                    boolean döngü = true;
                    while (döngü) {
                        System.out.println("Enter TC No:");
                        tempTC = in.next();

                        if (tempTC.length()==11) {
                            customer.setTC(tempTC);
                            döngü=false;
                        }
                    }
                    boolean döngü2 = true;
                    while (döngü2) {
                        System.out.println("Tel No:(without 0)");
                        tempTelNo = in.next();
                        if (tempTelNo.length() == 10) {
                            customer.setTelNo(tempTelNo);
                            döngü2 = false;
                        }
                    }
                    customer.setTicket(new Ticket(tempName,tempSurname,tempTC,tempTelNo,tempseatNumber,antalya,(250*yolcusayisi)-10));
                }
            }
        }
        else{
            System.out.println("You are not a member");
            System.out.println("returning to menu...");

        }





    }
        }





















