package polymorphism.study.subclasses;

import polymorphism.study.Movie;

public class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Killer shark on the loose!";
    }
}
