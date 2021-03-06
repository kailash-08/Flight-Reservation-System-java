public class Regularticket extends Ticket {
    private String food;
    private String water;
    private String snacks;
    
    // super called for Ticket constructor
    public Regularticket(int pnr, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, double priceOfTicket, boolean ticketSatus) {
        super(pnr, departureLocation, destinationLocation, dateAndTimeOfDeparture, dateAndTimeOfArrival, priceOfTicket, ticketSatus);
        System.out.println("\nRegular Ticket\nPNR :"+super.getPnr()+"\nDeparture Location :"+super.getDepartureLocation()+"\nDestination Location :"+super.getDestinationLocation()+"\nDate and Time of Departure :"+super.getDateAndTimeOfDeparture()+"\nDate and Time of Arrival :"+super.getDateAndTimeOfArrival()+"\nPrice of Ticket :"+super.getPriceOfTicket());
    }
    

    void getSpecialServices(String food, String water, String snacks){
        this.food = food;
        this.water = water;
        this.snacks = snacks;
        System.out.println("\nSpecial Services Availed are :"+this.food+", "+this.water+", "+this.snacks);
    }

    void updateSpecialServices(String updateFood, String updatewater, String updateSnacks){
        this.food = updateFood;
        this.water = updatewater;
        this.snacks = updateSnacks;

        System.out.println("Services Availed again are :"+this.food+", "+this.water+", "+this.snacks);
    }

    void showPnr(){
        System.out.println("\nPNR number for Regular Ticket :"+super.getPnr());
    }
    
}
