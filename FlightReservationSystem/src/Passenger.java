/* Passenger class with nested Address class and Contact class */ 

public class Passenger {
    private static int idCounter;
    private int id;
    private static Address address;
    private static Contact contact;
    private static User user;
    static {
        idCounter = 0;
    }
    public Passenger(){
        this.id = idCounter;
        idCounter++;
    }
    // Passenger constructor for getting contact info
    public Passenger(int id ,String name ,String phone ,String email){
        this.contact = new Contact(name, phone, email);
        this.id = id;
        contact.getContactDetails();
        
    }
    // Passenger constructor for getting address info
    public Passenger(String street ,String city , String state){
        this.address = new Address(street, city, state);
        address.getAddressDetails();
    }
    // nested contact class
     static class Contact {
        private String contactName;
        private String contactPhone;
        private String contactEmail;
        public Contact(String name ,String phone ,String email){
            this.contactName = name;
            this.contactPhone = phone;
            this.contactEmail = email;
        }
        void getContactDetails(){
            System.out.println("Name : "+this.contactName+"\nPhone Number : "+this.contactPhone+"\nemail : "+this.contactEmail);
        }
        
       
        
    }
    // nested address class
     static class Address {
        private String street;
        private String city;
        private String state;
        public Address(String street ,String city , String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
        void getAddressDetails(){
            System.out.println("Street : "+this.street+"\nCity : "+this.city+"\nState : "+this.state);
        }
        
       
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Below code to compare login Credentials
    
    public static User login(String userName,String password) {
        user=new User(userName,password);
        if(User.getUserName().equals(userName) && User.getPassword().equals(password)){
            System.out.println("logged in");
        }
        else
        {
            System.out.println("Invalid Login Credentials");
        }
        return user;
    }
    //To get Passenger count
    public int getPassengerCount() 
    {
        return idCounter;
    }
    
}
