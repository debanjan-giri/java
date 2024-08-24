package Searching;


public class LinearSearch { // TC O(n)
    static boolean Linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ar = { 23, 45, 45, 2, 1, 5, 1, 51 };
        Linear(ar, 5);
    }
}
