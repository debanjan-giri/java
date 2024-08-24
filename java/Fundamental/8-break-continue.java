

class box8 {
    public static void main(String[] args) {

        // break
        for (int i = 0; i < 2; i++) { // 0,1
            if (i == 1) { // 0 , 1
                break; // but when i = 1 , terminate
            }
            System.out.println(i); // 0
        }

        // continue
        for (int i = 0; i < 2; i++) { // 0,1
            if (i == 0) { // 0 , 1
                break; // but when i = 0 , skip this loop
            }
            System.out.println(i); // 1
        }

        // using labeled
        dev: for (int i = 0; i < 2; i++) {
            if (i == 1) { // 0 , 1
                break dev; // but when i = 1 , terminate
            }
            System.out.println(i); // 0
        }
    }
}