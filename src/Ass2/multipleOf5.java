import java.util.*;
// Write a program to count multiple of 5 in an array. Take the input array from the
// user.

public class multipleOf5 {
    public static int countMultiple(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] arg) {
        int[] arr = { 5, 45, 23, 63, 27, 80, 15, 2, 65, 30 };
        System.out.println(countMultiple(arr));
    }
}
