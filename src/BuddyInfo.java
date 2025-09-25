public class BuddyInfo {
    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo() {
        this("Rick", "12 Main Stret", "613-447-5069");
    }
    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "14 Main Street", "613-454-5634");
        String name = buddy.getName();
        System.out.println("Hello " + name);

    }
}
