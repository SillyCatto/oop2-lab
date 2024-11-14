public class User {
    private String username;
    private String password;
    private String email;
    private String userID;
    private UserType userType;

    public enum UserType {
        POWER,
        ADMIN,
        REGULAR
    }
    public User(String username, String password, String email, String userID, UserType userType) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.userID = userID;
        this.userType = userType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return userID + "," + username + "," + password + "," + email + "," + userType;
    }
}
