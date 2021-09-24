import java.util.LinkedList;

public class AddressBook {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", "Carleton University", "613-xxx-xxxx");
        AddressBook book = new AddressBook();
        book.addBuddy(buddy);
        book.removeBuddy(0);
        System.out.println("main finished");
    }
}
