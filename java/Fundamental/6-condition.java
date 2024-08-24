
// condition

class box6 {
    public static void main(String[] args) {

        // if
        if (true) { // if true then execute
            System.out.println();
        }

        // if else
        // only execute first one true block of code
        // so its reading top to bottom condition
        // if false then bydefault execute else
        int a = 0;
        if (a == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }

        // if else if
        // now else part can check condition
        // if false then -> else if false -> execute else
        if (a > 90) {
            System.out.println("");
        } else if (a == 0) {
            System.out.println("hi");
        } else {
            System.out.println("");
        }

        // switch case
        switch (0) {
            case 1: { // check case value == switch value
                System.out.println("hi");
                break;
            }
            case 0: { // if true then terminate program
                System.out.println("hello");
                break;
            }
            default: { // if all condition false then execute
                System.out.println("else part");
            }
        }

    }
}