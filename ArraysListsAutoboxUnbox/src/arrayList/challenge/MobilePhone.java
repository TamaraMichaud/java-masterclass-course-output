package arrayList.challenge;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// this nonsense fails instantly on the first of the SOLID principles.
// after a few minutes thought (watching the professor do it correctly...) you can no look at Mobile2 and ArrayListChallenge -> PhoneMenu for better code


public class MobilePhone {
    private ArrayList<Contact> contactsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public MobilePhone() {

        System.out.println("Starting Mobile Phone");
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
                        addContact();
                        break;
                    case 2:
                        removeContact();
                        break;
                    case 3:
                        editContact();
                        break;
                    case 4:
                        System.out.print("Contact name to search: ");
                        Contact contact = findContact(scanner.next());
                        System.out.println("Contact exists");
                        scanner.nextLine();
                        break;
                    case 5:
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

    private void removeContact() {
        System.out.print("Please enter contact name: ");
        String name = scanner.next();
        scanner.nextLine();
        // find contact: if not exists, stop
        if (findContact(name) != null) {
            System.out.println("Contact not found");
            return;
        }
        this.contactsList.remove(findContact(name));
        System.out.println("Contact removed successfully");

    }

    private Contact findContact(String name) {
        for (Contact nextContact : this.contactsList) {
            if (nextContact.getName().equals(name)) {
                return nextContact;
            }
        }
        return null;
    }

    private void editContact() {
        System.out.print("Please enter contact name: ");
        String name = scanner.next();
        scanner.nextLine();

        Contact nextContact = findContact(name);
        if (nextContact == null) {
            System.out.println("Contact <" + name + "> not found.");
            return;
        }

        StringBuilder editWhatMessage = new StringBuilder().append("Which information:\n ");
        int counter = 0;
        Field[] declaredFields = nextContact.getClass().getDeclaredFields();
        for (Field nextField : declaredFields) {
            counter++;
            editWhatMessage.append(String.format("\t%d) %s\n", counter, nextField.getName()));
        }

        System.out.print(editWhatMessage.toString());
        System.out.print("Select value to change: ");
        int editWhatField = scanner.nextInt();
        scanner.nextLine();

        String fieldName = declaredFields[editWhatField - 1].getName();
        System.out.print("Please enter new value for " + fieldName + ": ");
        String newValue = scanner.next();
        scanner.nextLine();

        try {
            String setterMethodName = "set" + fieldName.toUpperCase().charAt(0) +
                    fieldName.replaceAll("^.", "");
            Method[] methods = nextContact.getClass().getDeclaredMethods();
            for (Method nextMethod : methods) {
                if (nextMethod.getName().equals(setterMethodName)) {
                    nextMethod.invoke(nextContact, newValue);
                    break;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("did it work?");
        System.out.println(nextContact);
        System.out.println("New contact changed successfully");

    }

    private boolean addContact() {
        System.out.print("Please enter contact name: ");
        String name = scanner.next();
        scanner.nextLine();
        // find contact: if exists, stop
        if (findContact(name) != null) {
            System.out.println("Contact already exists with this name");
            return false;
        }
        System.out.print("Please enter contact number: ");
        String number = scanner.next();
        scanner.nextLine();
        Contact contact = new Contact(name, number);
        this.contactsList.add(contact);
        System.out.println("New contact added successfully");
        return true;
    }

    private void printInstructions() {
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
