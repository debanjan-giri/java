
// interface:
// interface is a way to achieve abstraction in java
// similar to a class but only contains abstract methods,
// also support body for default methods, static methods,
// contain variables which are public, static, and final.

// interface method
// define interface normal method by using default key
// define public during interface method implementation

// interface doesnot support constractor

interface box27 {
    int data = 78;

    void method();

    void method2();

    default void method3() {
        System.out.println("hello");
    }
}

// interface similar to abstract class so it cant create obj
class box28 implements box27 {

    @Override
    public void method() {
        System.out.println(data);
    }

    @Override
    public void method2() {
        System.out.println(data);
    }

    public static void main(String[] args) {

        box27 obj = new box28();
        obj.method(); // abstract method
        obj.method2(); // abstract method
        obj.method3(); // normal method
    }
}