package Verisoft;

import Verisoft.LSP_WaitingList.VIPWaitingList;

public class Main {
    public static void main(String[] args) {
        VIPWaitingList vipWaitingList = new VIPWaitingList();

        // Adding users to the waiting list
        vipWaitingList.addUser("VIP_User1");
        vipWaitingList.addUser("Regular_User1");
        vipWaitingList.addUser("VIP_User2");

        // Processing users
        vipWaitingList.processNextUser(); // Should process "VIP_User1"
        vipWaitingList.processNextUser(); // Should process "Regular_User1"
        vipWaitingList.processNextUser(); // Should process "VIP_User2"
        vipWaitingList.processNextUser(); // No more users
    }
}