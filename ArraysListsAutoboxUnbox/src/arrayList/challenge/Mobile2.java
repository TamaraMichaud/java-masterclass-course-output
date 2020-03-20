package arrayList.challenge;

import java.util.ArrayList;
import java.util.List;

public class Mobile2 {

    private ArrayList<Contact> contactsList = new ArrayList<>();

    public List<Contact> getContactList(){
        return this.contactsList;
    }

    public boolean removeContact(String contactName) {
        // find contact: if not exists, stop
        if (findContact(contactName) == null) {
            System.out.println("Contact not found");
            return false;
        }
        this.contactsList.remove(findContact(contactName));
        System.out.println("Contact removed successfully");
        return true;
    }

    public Contact findContact(String name) {
        for (Contact nextContact : this.contactsList) {
            if (nextContact.getName().equals(name)) {
                return nextContact;
            }
        }
        return null;
    }

    public boolean editContact(Contact oldContact, Contact newContact) {

        if (findContact(oldContact.getName()) == null) {
            System.out.println("Contact <" + oldContact.getName() + "> not found.");
            return false;
        }
        if (findContact(newContact.getName()) != null) {
            System.out.println("Your changes result in a contact which already exists");
            return false;
        }
        this.contactsList.remove(oldContact);
        this.contactsList.add(newContact);
        System.out.println("Contact updated");
        return true;
    }

    boolean addContact(Contact newContact) {
        // find contact: if exists, stop
        if (findContact(newContact.getName()) != null) {
            System.out.println("Contact already exists with this name");
            return false;
        }
        this.contactsList.add(newContact);
        System.out.println("New contact added successfully");
        return true;
    }
}
