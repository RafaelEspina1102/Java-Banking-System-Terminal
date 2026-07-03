import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users = new ArrayList<>();

    public void createAccount(String name, String username, String password) {
        users.add(new User(name, username, password));
    }

    public void login() {

    }


}
