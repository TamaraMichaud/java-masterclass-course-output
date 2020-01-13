package composition.updated2;

public class Computer {

    private Case casing;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case casing, Monitor monitor, Motherboard motherboard) {
        this.casing = casing;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
//        getCasing().pressPowerButton();
        casing.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(6,3,"purple");
    }

    // by having these private here; they bring no value so we can just as well use "monitor.drawPixelAt()"
//    private Case getCasing() {
//        return casing;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
    protected Motherboard getMotherboard() {
        return motherboard;
    }
}
