package composition.challengeExercise;

public class Bedroom {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Flooring floor;
    private Door door;
    private Window window;

    public Bedroom(Flooring floor, Door door, Window window) {
        this.wall1 = new Wall();
        this.wall2 = new Wall();
        this.wall3 = new Wall();
        this.wall4 = new Wall();
        this.floor = floor;
        this.door = door;
        this.window = window;
    }

    public void paintRoom(Wall wallToPaint){
        System.out.println("painting wall " + wallToPaint);
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Flooring getFloor() {
        return floor;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }
}
