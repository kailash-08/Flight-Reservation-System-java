public class User {
    private static String userName;
    private static String password;
    
    public User(String userName ,String password){
        this.userName = userName;
        this.password = password;
    }
    
    public static String getUserName() {
        return userName;
    }
    public static String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
