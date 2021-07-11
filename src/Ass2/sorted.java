
// Write a function to check if an array is sorted or not.

public class sorted {
    public static String checkSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                return "unsorted";
            }
        }

        return "sorted";

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 2 };
        System.out.println(checkSort(arr));

    }

}
