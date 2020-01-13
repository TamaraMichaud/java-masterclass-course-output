package composition.challengeExercise;

public class Door {

    private String material;
    private boolean lockable;
    private String opensOnWhichSide;

    public Door(String material, boolean lockable,  String opensOnWhichSide) {
        this.material = material;
        this.lockable = lockable;
        this.opensOnWhichSide = opensOnWhichSide;
    }

    public void enterRoom(){

        System.out.println("Opening door to " + opensOnWhichSide + " and entering room...");
    }

    public void lockDoor(){
        if(lockable) {
            System.out.println("locked the door");
        } else {
            System.out.println("tried to lock the door but seems we cant...");
        }
    }
}
