public class Flight {
    private String flightName;
    private int flightNumber;
    private String airlines;
    private int flightCapacity;
    private int bookedSeats;

    public Flight(String flightName, int flightNumber, String airlines, int flightCapacity, int bookedSeats){
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.airlines = airlines;
        this.flightCapacity = flightCapacity;
        this.bookedSeats = bookedSeats;

    }
    void getFlightDetails(){
        System.out.println("\nFLight Name :"+this.flightName+"\nFlight Number :"+this.flightNumber+"\nAirlines :"+this.airlines+"\nFlight Capacity :"+this.flightCapacity+"\nBooked Seats :"+this.bookedSeats);

    }
    public int updateBookedSeats(int recentlyBooked){
        int update = bookedSeats+recentlyBooked;
        System.out.println("Updated Seats booked :"+update);
        return update;
    }
    
}
