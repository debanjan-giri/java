package Array;

import java.util.Arrays;

// 1) print array
// 2) find the sum of array
// 3) find maximum element of a given array
// 4) find minimum element of a given array
// 5) find index of given element,if not found return-1
// 6) count the number of occurrences of given element
// 7) find the last occurrence of an element x
// 8) find second duplicate element
// 9) count the number of elements strictly greater x
// 10) check if the given array is sorted or not(asc)
// 11) find smallest and biggest element in given array
// 12) find the second largest element in given array
// 13) find first duplicate element,return the first
// 14) two sum of target value
// 15) three sum of target value
// 16) find one unique value where all value is duplicate
// 17) swap the 2 given values using temporary variable
// 18) swap values without temporary variable
// 19) reverse an array consisting of integer values
// 20) inplace reverse (without create new array)

public class question {

    // 1) print array
    static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 2) find the sum of array
    static void sum_of_array(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    // 3) find maximum element of a given array
    static void find_maximum(int arr[]) {
        int temp = Integer.MIN_VALUE; // or arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }

    // 4) find minimum element of a given array
    static int find_minimum(int arr[]) {
        int temp = Integer.MAX_VALUE; // or arr[0]
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
            }
        }
        return temp;
    }

    // 5) find index of given element,if not found return-1
    static int find_index(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 6) count the number of occurrences of given element
    static int count_duplicate(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // 7) find the last occurrence of an element x
    static int find_last_duplicate_index(int arr[], int target) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        return index;
    }

    // 8) find second duplicate element index
    static int find_second_duplicate_index(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                if (count == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    // 9) count the number of elements strictly greater then x
    static int find_strictly_gretter(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }
        return count;
    }

    // 10) check if the given array is sorted or not
    static boolean check_sorted_or_not(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp <= arr[i]) {
                temp = arr[i];
            } else {
                return false;
            }
        }
        return true;
    }

    // 10) check if the given array is sorted or not
    static boolean check_sorted_or_not2(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    // 11) find smallest and biggest element in given array
    static void find_smallest_biggest(int arr[]) {
        Arrays.sort(arr); // sort the array
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }

    // 12) find the second largest element in given array
    static int find_largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int find_second_largest(int arr[]) {
        int max = find_largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                arr[i] = -1;
            }
        }
        return find_largest(arr);
    }

    // 13) find first duplicate element,return the first
    static int find_first_duplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // 14) two sum of target value
    static int two_sum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    // 15) three sum of target value
    static int three_sum(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == target) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // 16) find one unique value where all value is duplicate
    static int find_unique(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        // convert all duplicate value to -1
        // then search which is not -1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                return arr[i];
            }
        }
        return -1;
    }

    // 17) swap the 2 given values using temporary variable
    static void swap_with_temp(int a, int b) {
        int temp = a; // store a value in temp
        a = b; // a replaced by b
        b = temp; // b replaced by temp
        System.out.println(a);
        System.out.println(b);
    }

    // 18) swap the 2 given values without temporary variable
    static void swap_without_temp(int a, int b) {
        a = a + b; // 5 + 3 = 8
        b = a - b; // 8 - 3 = 5
        a = a - b; // 8 - 5 = 3
        System.out.println(a);
        System.out.println(b);
    }

    // 19) reverse an array consisting of integer values
    static void array_reverse(int arr[]) {
        int[] ar = new int[arr.length];
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[index++] = arr[ar.length - 1 - i];
        }
        print_array(ar);
    }

    // 19) reverse an array consisting of integer values
    static void array_reverse_2(int arr[]) {
        int[] ar = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ar[index++] = arr[i];
        }
        print_array(ar);
    }

    // 20) inplace reverse (without create new array)
    static void array_inplace_reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        print_array(arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        // print_array(arr);
        // sum_of_array(arr);
        // find_maximum(arr);
        // find_minimum(arr);
        // System.out.println(find_index(arr, 78));
        // System.out.println(count_duplicate(arr, 90));
        // System.out.println(find_last_duplicate_index(arr, 90));
        // System.out.println(find_second_duplicate_index(arr, 90));
        // System.out.println(find_strictly_gretter(arr, 5));
        // System.out.println(check_sorted_or_not(arr));
        // System.out.println(check_sorted_or_not2(arr));
        // find_smallest_biggest(arr);
        // System.out.println(find_second_largest(arr));
        // System.out.println(find_first_duplicate(arr));
        // System.out.println(two_sum(arr, 10));
        // System.out.println(three_sum(arr, 6));
        // System.out.println(find_unique(arr));
        // swap_with_temp(3, 4);
        // swap_without_temp(3, 4);
        // array_reverse(arr);
        // array_reverse_2(arr);
        array_inplace_reverse(arr);

    }

}
