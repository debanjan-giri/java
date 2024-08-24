public class Practice {

    static boolean binaryTest(int[] a, int target) {

        int high = a.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(a[mid]);

            if (a[mid] == target) {
                return true;
            } else if (a[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 46, 89, 90, 99 };
        System.out.println(binaryTest(arr, 99));
    }
}
