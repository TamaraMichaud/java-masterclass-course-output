package composition.basic1;

public class Computer {

    private Case casing;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case casing, Monitor monitor, Motherboard motherboard) {
        this.casing = casing;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getCasing() {
        return casing;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
