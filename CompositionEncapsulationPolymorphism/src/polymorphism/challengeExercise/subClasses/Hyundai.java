package polymorphism.challengeExercise.subClasses;

import polymorphism.challengeExercise.Car;

public class Hyundai extends Car {

    public Hyundai() {
        super(6, "Toyota");
    }

    @Override
    public void accelerate() {

        System.out.println(getClass().getSimpleName() + " -> accelerate()");
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
