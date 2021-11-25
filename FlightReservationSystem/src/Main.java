/* Flight Reservation System 
*/
public class Main {
    public static void main(String[] args) throws Exception {
        User a = new User("abc", "abc1234");// TO register a user
        Passenger.login("abc", "abc1234");// login the registered user
        Passenger count = new Passenger();
        
        // Below code for passenger ID, Contact and Address details
        
        System.out.println("ID :"+count.getPassengerCount());
        Passenger.Contact contact = new Passenger.Contact("abc", "6545212545", "abc@example.com");
        Passenger.Address address = new Passenger.Address("Flatbush Avenue", "Brooklyn", "New York");
        contact.getContactDetails();
        address.getAddressDetails();
        
        //Below code for the passenger to book two types of tickets
        //1.Regular Ticket - contains ticket details , special services availed and to update special services  
        
        Regularticket obj = new Regularticket(1111111, "Banglore,India", "Delhi,India", "23-11-2021 , At 4:40 pm", "23-11-2021 , At 8:00 pm", 5000.00, true);
        obj.updateTicketStatus(true);
        obj.getSpecialServices("Indian Meal", "Coke", "Chips");
        obj.updateSpecialServices("Fries", "Water Bottle", "Chocolates");
        obj.updateTicketStatus(false);// This is just to show that ticket can be cancelled

        //2.Tourist Ticket - contains ticket details , hotel address , touirst location selected
        // Enter 5 random value when asked  "Enter tourist locations to be selected", for example:a,b,c,d,e
        
        Touristticket obj1 = new Touristticket(2222222, "Banglore,India", "Delhi,India", "23-11-2021 , At 4:40 pm", "23-11-2021 , At 8:00 pm", 5000.00, true);
        obj1.setHotelAddress("xyx Hotel");
        obj1.showHotelDetails();
        obj1.selectLocation();
        obj1.showLocation();
        obj1.updateTicketStatus(true); 
        obj1.flight = new Flight("Airbus A320", 9, "Air India", 150, 70);
        obj1.flight.getFlightDetails();     
        obj1.flight.updateBookedSeats(1);// This updates currently booked tickets

        obj.showPrn();// shows PRN number for Regular Ticket 
        obj1.showPrn();// shows PRN number for Tourist TIcket
    }
}
