
// class
// object is a representation of a real world concept, its a
// combination of data & behavior by hiding internal working 
// in programming we create obj using a blueprint called class
// so a class contain data and method so this class define
// what their obj can srore and what their obj can perform

class box11 {
    int data;

    void method() {
        System.out.println("hello");
    }
}

// object
// we can create multiple obj and that follow same blueprint
// and every object contain their own data and behavior and
// one obj data change doesnot effect blueprint and other obj
// bcz every obj create new memory location,they are isolated

class box12 {
    public static void main(String[] args) {
        // creating object
        // class obj_name = create_new_memory constructor();
        box11 obj = new box11();

        // print object address
        System.out.println(obj); // @6842775d

        // access data
        System.out.println(obj.data); // null

        // add data
        obj.data = 45;
        System.out.println(obj.data); // 45

        // access method
        obj.method(); // hello

        // print another object
        box11 obj2 = new box11();
        System.out.println(obj2); // @5ecddf8f
    }
}