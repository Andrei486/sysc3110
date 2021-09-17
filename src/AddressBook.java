import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "Carleton University", "613-xxx-xxxx");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(buddy);
    }
}
