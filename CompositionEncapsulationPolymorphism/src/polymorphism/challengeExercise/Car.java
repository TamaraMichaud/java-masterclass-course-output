package polymorphism.challengeExercise;

public class Car {

    private boolean engineOn;
    private int cylinders;
    private int wheels;
    private String model;
    private boolean inMotion;

    public Car(int cylinders, String model) {
        this.engineOn = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.model = model;
        this.inMotion = false;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");
        this.engineOn = true;
    }

    public void accelerate() {

        System.out.println("Car -> accelerate()");
        if (!this.engineOn) {
            System.out.println("ERROR: engine is not yet running! Cannot accelerate");
        } else {

            if (this.inMotion) {
                System.out.println("Accelerating further... aargh i'm scared it's so fast!!");
            } else {
                this.inMotion = true;
                System.out.println("Putting the pedal to the metal!!");
            }
        }
    }

    public void brake() {
        System.out.println("Car -> brake()");
        if (!this.engineOn) {
            System.out.println("ERROR: engine is not yet running! Cannot brake");
        } else if (this.inMotion) {
            System.out.println("skiiiiiiiiiiid!!! don't brake so roughly dammit!");
            this.inMotion = false;
        } else {
            System.out.println("err, we're not moving, which pedal are you aiming for cos you hit the brake...?");
        }
    }

    protected boolean isEngineOn() {
        return this.engineOn;
    }

    protected void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    protected boolean isInMotion() {
        return this.inMotion;
    }

    protected void setInMotion(boolean inMotion) {
        this.inMotion = inMotion;
    }
}
