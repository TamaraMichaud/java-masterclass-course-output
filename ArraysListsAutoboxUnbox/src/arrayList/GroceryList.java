package arrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> myArrayList = new ArrayList<>(); // () is because this is a CLASS
    // ^^ only takes Objects in <>.  no primitives

    void addGroceryItem(String itemName) {
        this.myArrayList.add(itemName);
    }

    void printGroceryList() {
        System.out.println(String.format("List is %d items long", myArrayList.size()));
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(String.format(" \t%d) - %s", i + 1, myArrayList.get(i)));
        }
    }

    public void modifyGroceryItem(String itemToMod, String newItem) {
        if (myArrayList.contains(itemToMod)) {
            modifyGroceryItem(findItemNew(itemToMod), newItem);
        }
    }

    void modifyGroceryItem(int idxPosition, String newItem) {
        if (idxPosition >= 0 && idxPosition < myArrayList.size()) {
            myArrayList.set(idxPosition, newItem);
            System.out.println("Modified item at position " + idxPosition + ", set to " + newItem);
        } else {
            System.out.println("Could not find item to change");
        }
    }

    void removeGroceryItem(String itemName){
        int idxPosition = findItemNew(itemName);
        myArrayList.remove(idxPosition);
    }

    void removeGroceryItem(int idxPosition) {
        if (idxPosition > 0 && idxPosition < myArrayList.size()) {
            myArrayList.remove(idxPosition);
        } else {
            System.out.println(String.format("Item number %d not found in list", idxPosition));
        }
    }

    int findItemNew(String soughtItem) {
        return myArrayList.indexOf(soughtItem);
    }

    String findItem(String soughtItem) {

        if (myArrayList.contains(soughtItem)) {
            return myArrayList.get(myArrayList.indexOf(soughtItem));
        }
        return null;

        // ^^ alternatively can do the below:
//        int indexOfItem = myArrayList.indexOf(soughtItem); // if not found, will be -1, else the index of the item.
//        return (indexOfItem >= 0 ) ? myArrayList.get(indexOfItem) : null;
    }

}
