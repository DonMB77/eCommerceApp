public class SignInMenu implements Menu {

    private ApplicationContext context;
    private UserManagementService userManagementService;

    {
        context = ApplicationContext.getInstance();
        userManagementService = DefaultUserManagementService.getInstance();
    }

    @Override
    public void start() {
        // <implementation pending>
    }

    @Override
    public void printMenuHeader() {
        // <implementation pending>
    }

}
