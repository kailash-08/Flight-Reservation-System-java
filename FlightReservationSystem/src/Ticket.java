public abstract class Ticket {
    private int pnr;
    private String departureLocation;
    private String destinationLocation;
    private String dateAndTimeOfDeparture;
    private String dateAndTimeOfArrival;
    private double priceOfTicket;
    private boolean ticketSatus;
    public Flight flight;

    public Ticket(int pnr, String departureLocation, String destinationLocation, String dateAndTimeOfDeparture, String dateAndTimeOfArrival, double priceOfTicket, boolean ticketSatus){
        this.setPnr(pnr);
        this.setDepartureLocation(departureLocation);
        this.setDestinationLocation(destinationLocation);
        this.setDateAndTimeOfDeparture(dateAndTimeOfDeparture);
        this.setDateAndTimeOfArrival(dateAndTimeOfArrival);
        this.setPriceOfTicket(priceOfTicket);
        this.setTicketSatus(ticketSatus);
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    public boolean isTicketSatus() {
        return ticketSatus;
    }
    public void setTicketSatus(boolean ticketSatus) {
        this.ticketSatus = ticketSatus;
    }
    public double getPriceOfTicket() {
        return priceOfTicket;
    }
    public void setPriceOfTicket(double priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }
    public String getDateAndTimeOfArrival() {
        return dateAndTimeOfArrival;
    }
    public void setDateAndTimeOfArrival(String dateAndTimeOfArrival) {
        this.dateAndTimeOfArrival = dateAndTimeOfArrival;
    }
    public String getDateAndTimeOfDeparture() {
        return dateAndTimeOfDeparture;
    }
    public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
        this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
    }
    public String getDestinationLocation() {
        return destinationLocation;
    }
    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
    public String getDepartureLocation() {
        return departureLocation;
    }
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }
    public int getPnr() {
        return pnr;
    }
    public void setPnr(int pnr) {
        this.pnr = pnr;
    }
    // Below method to book and cancel tickets
    void updateTicketStatus(boolean ticketSatus){
        if(ticketSatus == true){
            System.out.println("Ticket Booked");
        }else{
            System.out.println("Ticket Cancelled");
        }
    }
    
}
