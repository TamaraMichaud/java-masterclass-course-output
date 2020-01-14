package polymorphism.study;


import polymorphism.study.subclasses.*;

public class Main {

    public static void main(String[] args) {

        for(int i = 0; i < 9; i++) {
            Movie randomMovie = randomlySelectMovie();
            if(randomMovie == null) {
                System.out.println("OOPS, no movie selected!!");
            } else {
                System.out.println("Randomly selected movie: " + randomMovie.getName());
                System.out.println("Movie Plot: " + randomMovie.plot());
            }
        }
    }

    private static Movie randomlySelectMovie(){

        int randomNum = (int) (Math.random() * 5);
        System.out.println("Random number: " + randomNum);

        switch (randomNum) {
            case 0 : return new Jaws();
            case 1 : return new MazeRunner();
            case 2 : return new IndependenceDay();
            case 3 : return new StarWars();
            case 4 : return new ForgettableMovie();  // this class differs slightly from the others... look at them all properly
            default: return null;
        }

    }
}
