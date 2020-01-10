//public: access modifier, optional; including public private protected
//class: keyword
//braces: define the class body
// body can contain both data and code

public class Hello {

    public Hello() {
        System.out.println("Hello Again!");
    }

    // main method
    // public: access modifier
    // static: java keyword
    // void: return value
    // Main: method name
    // (): mandatory for optional parameters
    // String[]: parameter type; array of string
    // args: name of parameter
    //    this method takes only one parameter
    public static void main(String[] args){
        new Hello();
    }
}

