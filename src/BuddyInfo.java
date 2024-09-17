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

    @Override
    public String toString() {
        return "BuddyInfo{name='" + name + "', address='" + address + "', phoneNumber='" + phoneNumber + "'}";
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "123 Street", "123-456-7890");
        System.out.println("Hello " + buddy.getName());
        System.out.println("Address: " + buddy.getAddress());
        System.out.println("Phone Number: " + buddy.getPhoneNumber());
    }
}
