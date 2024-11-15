import java.util.ArrayList;

public class AdminUser extends NonRegularUser implements IAdminPrivileges {
    public AdminUser(String userID, String username, String email, String password, UserType userType) {
        super(userID, username, email, password, userType);
    }

    @Override
    public String toString() {
        return super.getUserID() + "," + super.getUsername() + "," + super.getPassword() + "," + super.getEmail();
    }

    @Override
    public void modifySettings() {

    }

    @Override
    public void updateUser(IUserWriter userWriter) {

    }

    @Override
    public void updatePrivileges(IUserWriter userWriter) {

    }
}
