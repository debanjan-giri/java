
// polymorphism
// It enables a single interface to represent various types

// Compile-time (Static Polymorphism):
// method is determined at compile time based on the arguments
// (during source code is translated into machine code)

// Method overloading
// it allows multiple methods with same name but different
// parameters in the same class

class box24 {
    void method() {
        System.out.println("hello");
    }

    void method(int a, String b) { // <-- compile time
        System.out.println("age :" + a);
        System.out.println("name :" + b);
    }

    int method(int a, int b) { // <-- compile time
        return a + b;
    }
}

// Runtime Polymorphism (Dynamic Polymorphism):
// overridden method determined by the type of obj at runtime.
// (when a program is running and executing instructions on pc)

// method overriding
// child class provide specific implementation of a method
// that is already defined in its parent class when method
// in a child class has the same = name,return,parameter

// final key
// that the method cannot be overridden by subclasses
class box29 {
    final void method() {
        System.out.println("hey");
    }
}

// super key
// accessing same method name & same data name inside child

class Parent {
    void method() {
        System.out.println("hello");
    }
}

class Child extends Parent {
    @Override
    void method() { // <-- runtime polymorphism
        System.out.println("hi");
    }

    void all() {
        method();// hi
        super.method();// hello
    }

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.method(); // hi

        // Child obj = new Child();
        // obj.method(); // hi
    }
}
