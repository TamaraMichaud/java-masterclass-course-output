package polymorphism.study.subclasses;

import polymorphism.study.Movie;

public class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "may the force be with you";
    }
}
