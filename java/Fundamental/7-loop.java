
// loop

class box7 {
    public static void main(String[] args) {

        // for loop
        // start 0 and increase 1 and end when 2<2
        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }

        // nested for loop
        for (int i = 0; i < 2; i++) { // loop 2 time
            for (int j = 0; j < 3; j++) {
                // loop 3 time when outer loop i = 0
                // loop 3 time when outer loop i = 1
            }
        }

        // while loop
        // check condition then decide loop or not
        int i = 0;
        while (i < 2) {
            System.out.println(i);
            i++;
        }

        // do while
        // execute first then decide loop or not
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 2);

        // for each (only for array)
        int[] arr = { 12, 34, 4, 6 };
        for (int r : arr) { // run until array length
            System.out.println(r);
        }
    }
}