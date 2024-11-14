public class AdminUser extends User{
    public AdminUser(String username, String password, String email, String userID, UserType userType) {
        super(username, password, email, userID, userType);
    }

    @Override
    public String toString() {
        return super.getUserID() + "," + super.getUsername() + "," + super.getPassword() + "," + super.getEmail();
    }
}
