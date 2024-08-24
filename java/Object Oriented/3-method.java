
// method
// method is a block of code execute when we call
// in oops method defines what object can perform
// have own data type and returing those data type
// int return int , string return string but void 
// return nothing (similar to variable data type)

class box17 {

    void method() {
        System.out.println("hello");
    }

    String method2() {
        return "";
    }
}

// method access modifier
// public : visible everywhere (public road)
// default : visible within same pkg (room fan)
// private : visible within same class (phone)
// protected : same pkg & subclass (parent money)

class box18 {

    // visible within same package
    void method6() {
        System.out.println("a");
    }

    // visible within same class
    private void method7() {
        System.out.println("");
    }

    public static void main(String[] args) {
        box18 obj = new box18();
        obj.method7();
    }
}

// static key
// access data and method without create object
class box19 {
    static int number;

    // static access only static data
    static void method4() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        number = 34;
        method4(); // 34
    }
}

// method parameter and argument
class box20 {

    static void method12(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        // diff argument create diff result
        method12(2, 4); // 6
        method12(5, 5); // 10
    }
}

// what is: public static void main(String[] args){}
class box21 {
    public static void main(String[] args) {
        // by default class access modifier is public
        // public static void main(String[] args) {}
        // main function is a entry for code execution
        // public => main function can acces by anyone
        // so JVM can executed from outside class
        // static => without obj ,we create main function
        // so jvm can save memory bcz obj create memory
        // void => this function doesnot retun anything
        // when main() terminates,program terminates too
        // String[] args => cmd arg stored array of string
    }
}