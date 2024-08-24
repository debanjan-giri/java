
// operator + & operands 1

class box5 {
    public static void main(String[] args) {
        // arithmatic operator
        System.out.println(583 % 10); // 3
        System.out.println(583 / 10); // 58
        System.out.println(12 - (12 + 12) * 12); // -276

        // assignment operator
        // = , += , -= , *= , /= , %=
        int c = 10; // c = 10
        c += 5; // c = c + 5 so (c = 10 + 5)
        System.out.println(c); // 15

        // relational operator
        System.out.println(1 < 2); // true
        System.out.println(1 > 2); // false
        System.out.println(1 != 2); // true
        System.out.println(1 == 2);// false
        System.out.println(2 >= 2);// true
        System.out.println(2 <= 2); // true

        // logical operator
        System.out.println(true && true); // true
        System.out.println(false || true); // true
        System.out.println(!(true)); // false

        // unray operator
        int n = 8; // ++ --
        System.out.println(++n); // 9
        System.out.println(n++); // 9
        System.out.println(n); // 10

        // ternary
        // if true then return "first"
        String result = (n < 8) ? "first" : "second";
        System.out.println(result);

        // instanceof
        // check which object from which class
        box5 obj = new box5();
        System.out.println(obj instanceof box5); // true

        // check String is a class or not
        String obj2 = new String();
        System.out.println(obj2 instanceof String); // true
    }
}