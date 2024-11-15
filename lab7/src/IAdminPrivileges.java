public interface IAdminPrivileges {
    void modifySettings();
    void updateUser(IUserWriter userWriter);
    void updatePrivileges(IUserWriter userWriter);
}
