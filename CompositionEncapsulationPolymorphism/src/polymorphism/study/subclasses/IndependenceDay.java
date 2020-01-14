package polymorphism.study.subclasses;

import polymorphism.study.Movie;

public class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens coming to get you!";
    }
}
