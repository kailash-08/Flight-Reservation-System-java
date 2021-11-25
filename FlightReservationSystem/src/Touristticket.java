import java.util.Scanner;

public class Touristticket extends Ticket {
    private String hotelAddress;
    private String[] touristLocation = new String[5];
    
    // super called for Ticket constructor
    public Touristticket(int prn, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, double priceOfTicket, boolean ticketSatus) {
        super(prn, departureLocation, destinationLocation, dateAndTimeOfDeparture, dateAndTimeOfArrival, priceOfTicket, ticketSatus);
        System.out.println("\nTourist Ticket\nPRN :"+super.getPrn()+"\nDeparture Location :"+super.getDepartureLocation()+"\nDestination Location :"+super.getDestinationLocation()+"\nDate and Time of Departure :"+super.getDateAndTimeOfDeparture()+"\nDate and Time of Arrival :"+super.getDateAndTimeOfArrival()+"\nPrice of Ticket :"+super.getPriceOfTicket());
    }


    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    void showHotelDetails(){
        System.out.println("Hotel Address :"+getHotelAddress());
    }
    
    Scanner sc = new Scanner(System.in);

    void selectLocation(){
        System.out.println("Enter tourist locations to be selected :");
        for(int i=0; i<=4; i++) {
            touristLocation[i] = sc.next();
         }
    }
    void showLocation(){
        for(int i=0; i<=4; i++) {
            System.out.println("Selected tourist location :"+touristLocation[i]);
         }
        
    }
    void showPrn(){
        System.out.println("\nPRN number for Tourist Ticket :"+super.getPrn());
    }
    
}
