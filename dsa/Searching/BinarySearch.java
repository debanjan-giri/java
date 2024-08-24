package Searching;


public class BinarySearch {
    // Binary search on a
    // sorted array: 9, 12, 34, 45, 59, 68, 70, 83, 90, 99

    // First iteration
    // Find mid = (start 0 + end 9) / 2 = 4 (index)
    // Start = 9, Mid = 59, End = 99, Target = 70
    // If Mid < Target 9,12,34,45,[59],68,70,83,90,99
    // _____________________________--------right---->
    // update Start = Mid + 1 it mean now it search from = 68
    // New range: 68, 70, 83, 90, 99

    // Second iteration
    // Find mid = (start 0 + end 4) / 2 = 2 (index)
    // Start = 68, Mid = 83, End = 99, Target = 70
    // If Mid > Target, 68,70,[83],90,99
    // _________________<--left--_______
    // update End = Mid - 1 (70),but start didnot update 68
    // New range: 68,70

    // Third iteration
    // Find mid = (start 0 + end 1) / 2 = 0 (index)
    // Start = 68, Mid = 68, End = 70, Target = 70
    // If Mid < Target, update start = mid + 1
    // 68,70
    // __--> right side

    // fourth iteration
    // Find mid = (start 0 + end 0) / 2 = 0 (index)
    // Start = 70, Mid = 70, End = 70, Target = 70
    // in this loop start always low index and end is high
    // but at the end all 3 index is same so loop until same
    // if Mid == target ,return true otherwise false

    static boolean binary(int[] ar, int target) { // TC O(logN)
        int n = ar.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // int mid2 = low + (high - low) / 2;**
            if (target == ar[mid]) {
                return true;
            } else if (target < ar[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    // recursion
    static boolean recBinary(int[] ar, int st, int end, int target) {
        if (st > end) {
            return false;
        }
        int mid = (st + end) / 2;
        if (target == ar[mid]) {
            return true;
        } else if (target < ar[mid]) {
            return recBinary(ar, st, mid - 1, target);
        } else {
            return recBinary(ar, mid + 1, end, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 12, 34, 45, 59, 68, 70, 83, 90, 99 };
        int target = 70;
        System.out.println(binary(arr, target));

        while (target != arr[arr.length - 1] + 1) {
            System.out.printf("%d exists: %b \n", target, binary(arr, target));
            target++;
        }
        System.out.println(recBinary(arr, 0, arr.length - 1, 70));
    }
}

// binary search problems
class binaryProblems {
    // find the first occurrence of a given element x, given array is sorted,if no
    // occurrence of x is found then return -1;

    static int binaryFirstOcc(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int update = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                update = mid; // even i found but go to left
                end = mid - 1; // we want to go atleast 0 index
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return update;
    }

    static int binaryLastOcc(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int temp = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                temp = mid;
                start = mid + 1;
            } else if (x < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return temp;
    }

    // find the squre root of the given non negetive va.ue x. round it off to the
    // nearest floor integer value.

    static int sqrtBinary(int x) {
        int st = 0, end = x;
        int ans = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val == x) {
                return mid;
            } else if (val < x) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ar[] = { 5, 5, 5, 5, 5, 7, 8, 9 };
        System.out.println(binaryFirstOcc(ar, 5));
        System.out.println(binaryLastOcc(ar, 5));
        System.out.println(sqrtBinary(25));
    }
}