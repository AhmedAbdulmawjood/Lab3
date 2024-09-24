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

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // First buddy
        BuddyInfo buddy1 = new BuddyInfo("John", "123 Street", "123-456-7890");
        addressBook.addBuddy(buddy1);
        addressBook.printBuddies();
        System.out.println("Address book is ready!");

        // Second buddy - add and then remove
        BuddyInfo buddy2 = new BuddyInfo("Jane", "456 Avenue", "987-654-3210");
        addressBook.addBuddy(buddy2);
        System.out.println("Added Jane to the address book.");
        addressBook.removeBuddy(buddy2);
        System.out.println("Removed Jane from the address book.");
        //testing 
    }
}
