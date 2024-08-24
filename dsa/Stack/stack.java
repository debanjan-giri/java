package Stack;

// stack
// [ 12 | 45 | 23  <-- storing 89
// [ 12 | 45 | 23 | 89 <-- you can store only top of stack
// want to access 12 then u have to remove 89 then 23 then 45
// [ 12 --> removed 45,23,89 <-- then you can get access 12
// stack have unlimited size but sometimes stack will overflow
// getting element TC O(n) ,SC O(n) bcz remove then add again

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push TC O(1)
        st.push(1);
        st.push(2);
        st.push(3);

        // pop TC O(1)
        st.pop(); // [3]

        // peek TC O(1)
        System.out.println(st.peek()); // [2]

        // is empty
        System.out.println(st.isEmpty()); // false

        // print
        System.out.println(st); // [1,2]

        // size
        System.out.println(st.size()); // 2

    }
}
