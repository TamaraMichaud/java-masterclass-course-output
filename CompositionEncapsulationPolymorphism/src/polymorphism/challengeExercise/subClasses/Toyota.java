package polymorphism.challengeExercise.subClasses;

import polymorphism.challengeExercise.Car;

public class Toyota extends Car {

    public Toyota() {
        super(6, "Toyota");
    }

    @Override
    public void accelerate() {

        if(isInMotion()) {
            System.out.println("Accelerating further... ouch, the G-forces!!");
        } else if (isEngineOn()) {
            setInMotion(true);
            System.out.println("0 to 60 in 0.2, did you get whiplash hehe?");
        } else {
            System.out.println("woops, dont you want to start the engine first...?");
        }

    }


    @Override
    public void brake(){
        if(isInMotion()) {
            System.out.println("oof, too harsh - you stalled it!");
            setInMotion(false);
            setEngineOn(false);
        } else if(isEngineOn()) {
            System.out.println("err, we're not moving, which pedal are you aiming for cos you hit the brake...?");
        } else {
            System.out.println("...you haven't even started the car yet! Are you drunk?");
        }
    }
}
