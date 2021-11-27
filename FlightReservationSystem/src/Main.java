import java.util.Scanner;

/* Flight Reservation System 
*/
public class Main {
    public static void main(String[] args) throws Exception {
        String userName, password, name, phone, email, street, city, state;
        Scanner sc = new Scanner(System.in);
        System.out.println("--Welcome to Flight Reservation System--\nEnter User name :");
        userName = sc.nextLine();
        System.out.println("Enter password :");
        password = sc.nextLine();
        User a = new User(userName, password);// TO register a user
        System.out.println("\n--Registered new User--");
        Passenger.login(userName, password);// login the registered user
        Passenger count = new Passenger();
        
        // Below code for passenger ID, Contact and Address details
        
        System.out.println("ID :"+count.getPassengerCount());
        System.out.println("\n--Enter Contact Details-- \nEnter Name :");
        name = sc.nextLine();
        System.out.println("Enter Phone Number :");
        phone = sc.nextLine();
        System.out.println("Enter email :");
        email = sc.nextLine();
        Passenger.Contact contact = new Passenger.Contact(name, phone, email);
        System.out.println("\n--Enter Address Details-- \nEnter Street :");
        street = sc.nextLine();
        System.out.println("Enter city :");
        city = sc.nextLine();
        System.out.println("Enter State :");
        state = sc.nextLine();
        Passenger.Address address = new Passenger.Address(street, city, state);
        System.out.println("\n--Details saved--\nFollowing are your Contact and Address Details\n");
        contact.getContactDetails();
        address.getAddressDetails();
        
        //Below code for the passenger to book two types of tickets
        //1.Regular Ticket - contains ticket details , special services availed  
        int pressed;
        System.out.println("\n--Book your Ticket--\nPress 1 for Regular Ticket\nPress 2 for Tourist Ticket");
        pressed = sc.nextInt();

        
        
        if(pressed == 1){
            String food, water,snacks;
            Regularticket obj = new Regularticket(1111111, "Banglore,India", "Delhi,India", "23-11-2021 , At 4:40 pm", "23-11-2021 , At 8:00 pm", 5000.00, true);
            System.out.println("\n--Enter Special Services to be availed-- :\nEnter Food :");
            food = sc.next();
            System.out.println("Enter Drinks :");
            water = sc.next();
            System.out.println("Enter Snacks :");
            snacks = sc.next();
            obj.getSpecialServices(food, water, snacks);
            System.out.println("\nTo confirm your Booking press 1\nTo cancel your Booking press 2");
            int accept = sc.nextInt();
            if(accept == 1){
                obj.updateTicketStatus(true);
                obj.flight = new Flight("Airbus A320", 9, "Air India", 150, 70);
                obj.flight.getFlightDetails();     
                obj.flight.updateBookedSeats(1);
            }else if(accept == 2){
                obj.updateTicketStatus(false);
            }
            obj.showPnr();
            
        }


        //2.Tourist Ticket - contains ticket details , hotel address , touirst location selected
        // Enter 5 random value when asked  "Enter 5 tourist locations to be selected", for example:a,b,c,d,e
        
        
        if(pressed == 2){
            Touristticket obj1 = new Touristticket(2222222, "Banglore,India", "Delhi,India", "23-11-2021 , At 4:40 pm", "23-11-2021 , At 8:00 pm", 5000.00, true);
            System.out.println("\n--Enter Hotel address--");
            String hotelAddress = sc.next();
            obj1.setHotelAddress(hotelAddress);;
            obj1.showHotelDetails();
            obj1.selectLocation();
            obj1.showLocation(); 
            System.out.println("\nTo confirm your Booking press 1\nTo cancel your Booking press 2");
            int accept = sc.nextInt();
            if(accept == 1){
                obj1.updateTicketStatus(true);
                obj1.flight = new Flight("Airbus A320", 9, "Air India", 150, 70);
                obj1.flight.getFlightDetails();     
                obj1.flight.updateBookedSeats(1);
            }else if(accept == 2){
                obj1.updateTicketStatus(false);
            }
            obj1.showPnr();
            
        }

        
    }
}
