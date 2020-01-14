package polymorphism.challengeExercise;

import polymorphism.challengeExercise.subClasses.Hyundai;
import polymorphism.challengeExercise.subClasses.Toyota;

public class Main {

    public static void main(String args[]) {

        Car myCar = getRandomCar();

        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();

    }

    private static Car getRandomCar(){

        return new Hyundai();
    }
}

class Ford extends Car {

    public Ford() {
        super(4, "Focus");
    }

    @Override
    public void accelerate() {

        if(isInMotion()) {
            System.out.println("HYUNDAI: Accelerating further... not sure if anything's happening but we're still moving...");
        } else if (isEngineOn()) {
            setInMotion(true);
            System.out.println("wait for it.... the car is actually accelerating, albeit super slowly!");
        } else {
            System.out.println("woops, dont you want to start the engine first...?");
        }

    }

    @Override
    public void brake() {
        System.out.println("aaaaarrrrrgggghhh!!!!!  ..... phew, stopped just in time!");
//        setInMotion(false);  // we'll stay in motion, just slower lol... the brakes are terrible onthis car!
    }


    @Override
    public void startEngine(){
        System.out.println("nope.... nope.... finally - third time lucky!");
        setEngineOn(true);
    }


}

