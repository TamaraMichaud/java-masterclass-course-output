package arrayList.challenge;

public class Contact {
    private String name, number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact(Contact copyFrom){
        this.name = copyFrom.getName();
        this.number = copyFrom.getNumber();
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
