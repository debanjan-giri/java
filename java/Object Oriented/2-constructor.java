
// constructor
// constructor is a special method and that is used to
// create new object and same name as the class name 
// and it automatically called when object is created 

// automatically execution
class box13 {
    public static void main(String[] args) {
        box13 obj = new box13(); // <-- constructor
        System.out.println(obj); // @sdhft634
    }
}

// define constructor
class box14 {

    // public , private , protected
    // dont use Static key*

    // public box14() {
    // System.out.println("hi");
    // }

    box14() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        box14 obj = new box14(); // hi
        System.out.println(obj); // @hg364235
    }
}

// execute constructor without creating obj
class box15 {

    // box15() {
    // System.out.println("hello");
    // }

    public static void main(String[] args) {
        new box15();
    }
}

// constructor overloading
// same constructor name with different parameter
class box16 {
    box16(int n) {
        System.out.println(n);
    }

    box16(int n, int m) {
        System.out.println(n + m);
    }

    public static void main(String[] args) {
        new box16(5); // 5
        new box16(2, 2); // 4

        // box16 foo = new box16(2);
    }
}