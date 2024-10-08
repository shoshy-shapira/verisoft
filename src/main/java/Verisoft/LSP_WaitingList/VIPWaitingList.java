package Verisoft.LSP_WaitingList;

import java.util.ArrayList;
import java.util.List;

public class VIPWaitingList extends WaitingList {
    protected List<String> usersVIP = new ArrayList<>();

    @Override
    public void addUser(String user) {
        if (user.startsWith("VIP_")) {
            usersVIP.add(user);  // Separate VIP users
        }
        super.addUser(user);  // Add to base list
    }

    @Override
    public void processNextUser() {
        if (!usersVIP.isEmpty()) {
            String vipUser = usersVIP.remove(0);
            System.out.println("Processing VIP user: " + vipUser);
        } else {
            super.processNextUser();
        }
    }
}
