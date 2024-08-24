
// abstraction
// it involves hiding the complex implementation details of an
// obj and exposing only the necessary features or behaviors.

// abstract class
// cannot create its own obj but iniheritance create its obj
// it support abstract method and normal method

// abstract method
// doesnot have body,every inherited class must override the
// abstract method body.(unique implementation cause poly)

// abstract constractor
// super key used for accessing inside child constructor 

abstract class box25 {
    int data = 34;

    // method blueprint for another classes
    abstract void work();

    void method() {
        System.out.println("hi");
    }

    box25() {
        System.out.println("hello");
    }
}

class box26 extends box25 {

    @Override
    void work() {
        System.out.println(data);
    }

    box26() {
        super();
    }

    public static void main(String[] args) {
        box25 obj = new box26();
        obj.work(); // 34
    }
}