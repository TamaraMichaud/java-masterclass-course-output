package polymorphism.study.subclasses;

import polymorphism.study.Movie;

public class MazeRunner extends Movie {


    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids trapped in a maze...";
    }
}
