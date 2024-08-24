
// inheritance :

// Code Reusability
// a child class is created from parent class and child 
// class inherit the data and method from parent class
// this means child class can resue code from parent

// code Readability
// help classes to be organized in a hierarchical manner
// making it easier to understand and maintain code.

// Extensibility
// child class can extending the functionality of parent 
// classes without modifying their implementation.

// parent class
class box22 {
    int data = 23;

    void method() {
        System.out.println("hello");
    }
}

// child class
class box23 extends box22 {

    void method2() {
        method(); // access parent method
        System.out.println(data); // access parent data
    }

    public static void main(String[] args) {
        box23 obj = new box23();
        obj.method(); // parent method
        obj.method2(); // child method
    }
}

// Final Classes:
// It prevents inheritance, making the class immutable
final class box30 {
    public static void main(String[] args) {

    }
}