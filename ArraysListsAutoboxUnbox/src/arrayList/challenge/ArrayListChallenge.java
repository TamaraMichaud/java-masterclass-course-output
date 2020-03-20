package arrayList.challenge;

// create a program that implements a simple mobile phone with the following capabilities:
// able to store, modify, remove and query contact names
// you will want to create a separate class for Contacts (name and phone number)
// create a MobilePhone (master) class that holds an ArrayList of Contacts
// add a menu of options for mobilePhone to; add/remove/edit/list/search/quit
// do all by names. keep classes private where possible

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayListChallenge {
    public static void main(String[] args) {

//        System.out.println("Starting Test");
//        MobilePhone mobilePhone = new MobilePhone();
//        System.out.println("Ending Test");

        // designed very terribly.  Scanner is bound to MobilePhone and should not be...
        // but de-tangling them is going to be ugly... start over?
        new PhoneMenu(new Mobile2()).open(); // << does everything...
    }
}

class PhoneMenu {

    private Scanner scanner = new Scanner(System.in);
    private Mobile2 mobilePhone;

    public PhoneMenu(Mobile2 mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void open() {

        System.out.println("Opening Mobile Phone Address Book");
        printInstructions();

        System.out.print("Selection [0-6]: ");
        while (scanner.hasNext()) {
            String nextVal = scanner.next();
            if (nextVal.replaceAll("[^0-9]", "").equals(nextVal)) {

                switch (Integer.parseInt(nextVal)) {
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        String name = promptFor("name");
                        String number = promptFor("number");
                        success(mobilePhone.addContact(new Contact(name, number)));
                        break;
                    case 2:
                        success(mobilePhone.removeContact(promptFor("name")));
                        break;
                    case 3:
                        Contact oldContact = mobilePhone.findContact(promptFor("name"));
                        Contact newContact = changeContact(new Contact(oldContact));
                        mobilePhone.editContact(oldContact, newContact);
                        break;
                    case 4:
                        System.out.print("Contact name to search: ");
                        Contact contact = mobilePhone.findContact(scanner.next());
                        String response = (contact != null) ? "Contact exists" : "Contact not found";
                        System.out.println(response);
                        scanner.nextLine();
                        break;
                    case 5:
                        AtomicInteger ref = new AtomicInteger(1);
                        mobilePhone.getContactList()
                                .forEach(c ->
                                        System.out.println("\t" + ref.getAndIncrement() + ") " + c.getName() + ": " + c.getNumber() + "\n")
                                );
                        break;
                    case 6:
                        scanner.close();
                        System.out.println("Goodbye");
                        return;
                    default:
                        System.out.println("Woops, selection not recognised");
                        break;
                }
            }
            System.out.print("Menu selection [0-6]: ");
        }
    }

    private Contact changeContact(Contact oldContact) {

        StringBuilder editWhatMessage = new StringBuilder().append("Which information:\n ");
        int counter = 0;
        Field[] declaredFields = oldContact.getClass().getDeclaredFields();
        for (Field nextField : declaredFields) {
            counter++;
            editWhatMessage.append(String.format("\t%d) %s\n", counter, nextField.getName()));
        }
        editWhatMessage.append("\tC) cancel\n");

        System.out.print(editWhatMessage.toString());
        System.out.print("Select value to change: ");
        while (scanner.hasNext()) {
            String editWhatField = scanner.next();
            if(editWhatField.equals("C")) return oldContact;
            scanner.nextLine();
            String fieldName = declaredFields[Integer.parseInt(editWhatField) - 1].getName();
            System.out.print("Please enter new value for " + fieldName + ": ");
            String newValue = scanner.next();
            scanner.nextLine();

            try {
                String setterMethodName = "set" + fieldName.toUpperCase().charAt(0) +
                        fieldName.replaceAll("^.", "");
                Method[] methods = oldContact.getClass().getDeclaredMethods();
                for (Method nextMethod : methods) {
                    if (nextMethod.getName().equals(setterMethodName)) {
                        nextMethod.invoke(oldContact, newValue);
                        break;
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                System.out.println("Oh no big boo boo!");
                e.printStackTrace();
            }

            System.out.println("Value updated");
            System.out.print(editWhatMessage.toString());
            System.out.print("Select value to change: ");
        }
        return oldContact;
    }


    private String promptFor(String input) {
        System.out.print("Please enter contact " + input + ": ");
        String value = scanner.next();
        scanner.nextLine();
        return value;
    }

    private void success(boolean trueFalse) {
        if (!trueFalse)
            System.out.println("Error");
    }

    public void printInstructions() {
        System.out.println("Menu Navigation\n\n" +
                "\t0) menu options\n" +
                "\t1) add contact\n" +
                "\t2) remove contact\n" +
                "\t3) edit contact\n" +
                "\t4) find contact\n" +
                "\t5) list all contacts\n" +
                "\t6) exit\n");
    }

}