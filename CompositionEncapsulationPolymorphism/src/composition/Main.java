package composition;

public class Main {

    public static void main(String args[]) {

        Dimensions caseDimensions = new Dimensions(20,20,5);
        Case computerCasing = new Case("220B", "Dell", "240", caseDimensions);
        Monitor monitor = new Monitor("30Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("XX-200", "Asus", 4, 5, "v2.44");

        Computer myComputer = new Computer(computerCasing, monitor, motherboard);

        myComputer.getCasing().pressPowerButton();
        myComputer.getMotherboard().loadProgram("Paint 2.0");
        myComputer.getMonitor().drawPixelAt(4,5, "red");

    }
}
