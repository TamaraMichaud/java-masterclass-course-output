package composition.challengeExercise;

public class Flooring {

    private String flooringType;
    private int length;
    private int width;

    public Flooring(String flooringType, int length, int width) {
        this.flooringType = flooringType;
        this.length = length;
        this.width = width;
    }

    public double getFloorArea(){
        return length * width;
    }
}
