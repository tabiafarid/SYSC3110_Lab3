import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddyInfo) {
        if (buddyInfo != null) {
            buddies.add(buddyInfo);
        }

    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }

        return null;
    }

    public ArrayList<BuddyInfo> getBuddies() {
        return buddies;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Talia", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);

    }
}


