import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users = new ArrayList<>();

    public void createAccount(String name, String username, String password) {
        boolean checkDuplicate = false;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                checkDuplicate = true;
            }
        }

        if (!checkDuplicate) {
            users.add(new User(name, username, password));
        }
        // add duplicate checking
    }

    public User login(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.checkPassword(password)) {
                    return user;
                } else {
                    System.out.println("Incorrect Password");
                    return null;
                }
            }
        }
        System.out.println("No username found");
        return null;
    }

}
