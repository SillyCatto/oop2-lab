import java.io.IOException;

public abstract class NonRegularUser extends User implements IWriteOnly{
    public NonRegularUser(String userID, String username, String email, String password, UserType userType) {
        super(userID, username, email, password, userType);
    }

    @Override
    public void writeUserData(IUserWriter userWriter) {

    }

}
