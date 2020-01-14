package polymorphism.study.subclasses;

import polymorphism.study.Movie;

public class ForgettableMovie extends Movie {

    public ForgettableMovie() {
        super("Forgettable");
    }

    // we have deliberately NOT overridden "plot" here so that we can better show how polymorphism works...
    // seems quite similar to using an interface; except that you have some base methods to work with thankfully.

}
