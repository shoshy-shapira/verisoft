package Verisoft.LSP_WaitingList;

import java.util.ArrayList;
import java.util.List;

public class WaitingList {
    protected List<String> users = new ArrayList<>();

    // Add a user to the waiting list
    public void addUser(String user) {
        users.add(user);
    }

    // Process the next user in the waiting list
    public void processNextUser() {
        if (!users.isEmpty()) {
            String user = users.remove(0);
            System.out.println("Processing user: " + user);
        } else {
            System.out.println("No users in the waiting list.");
        }
    }

}
