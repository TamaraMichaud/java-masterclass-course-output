package arrayList;

import java.util.Scanner;

public class MainByRefNotIdx {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();

    public static void main(String args[]) {

        System.out.println("Welcome to my command-line shopping-list 'app'!");
        printInstructions();
        System.out.print("Choose the next action [1-6]: ");
        int nextValue;
        while (scanner.hasNext()) {

            nextValue = scanner.nextInt();
            scanner.nextLine();
            switch (nextValue) {

                case 0:
                    printInstructions();
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    changeItem();
                    break;
                case 4:
                    checkItem();
                    break;
                case 5:
                    myList.printGroceryList();
                    break;
                case 6:
                    scanner.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Silly billy, that's not how this works...");
                    printInstructions();
            }
            System.out.print("Choose the next action [1-6]: ");
        }
    }

    private static void checkItem() {
        System.out.print("Please enter the name of the item you seek: ");
        String itemName = scanner.nextLine();
        if(myList.findItem(itemName) != null){
            System.out.println("Found item <" + itemName + "> in list");
        } else {
            System.out.println("Sorry, couldn't find that item");
        }
    }


    private static void changeItem() {
        System.out.println("Here is your list at present:");
        myList.printGroceryList();
        System.out.print("Please enter the name the item you wish to change: ");
        String itemToChange = scanner.nextLine();
//        scanner.nextLine(); // << scanner doesn't recognise that you've finished inputting otherwise
        System.out.print("Please enter the name you want instead: ");
        String newItem = scanner.nextLine();
        myList.modifyGroceryItem(itemToChange, newItem);
        System.out.println("List updated");
    }

    private static void printInstructions() {
        System.out.println("Please enter one of the following: ");
        System.out.println("\t0 - Reprint instructions");
        System.out.println("\t1 - To add an item to the grocery list");
        System.out.println("\t2 - To remove an item from the grocery list");
        System.out.println("\t3 - To change an item on the grocery list");
        System.out.println("\t4 - To check if an item is already on the grocery list");
        System.out.println("\t5 - Display the full grocery list");
        System.out.println("\t6 - Exit");

    }

    private static void addItem() {
        System.out.print("Please type the item to add to the list: ");
        String item = scanner.nextLine();
        myList.addGroceryItem(item);
    }


    private static void removeItem() {
        System.out.println("Here is your list at present:");
        myList.printGroceryList();
        System.out.print("Please type the item to remove from the list: ");
        myList.removeGroceryItem(scanner.nextInt() -1);
        scanner.nextLine();
    }


}

