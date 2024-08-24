

// variable
// its a memory container for holding value and their data type
// every variable box name should be unique within memory

class box2 {
    public static void main(String[] args) {
        // create variable and their data type
        int number;
        // assign data
        number = 45;
        // update data
        number = 56;
        // read data
        System.out.println(number); // 56

        // value cannot be changed once assigned.
        final int num = 67;
        System.out.println(num);
    }
}
