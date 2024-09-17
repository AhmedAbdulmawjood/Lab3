import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            this.buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        this.buddies.remove(buddy);
    }

    // Optionally, add a method to print all buddies
    public void printBuddies() {
        for (BuddyInfo buddy : buddies) {
            System.out.println(buddy);
        }
    }
}


public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;



    public BuddyInfo() {
        this("Default Name", "Default Address", "000-000-0000");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        buddy.name = "John";
        buddy.address = "123 Street";
        buddy.phoneNumber = "123-456-7890";
        System.out.println("Hello " + buddy.getName());
        System.out.println("Address: " + buddy.getAddress());
        System.out.println("Phone Number: " + buddy.getPhoneNumber());
    }
}
