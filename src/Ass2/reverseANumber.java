import java.util.*;

// 4. Write a program to reverse a number: 38105 -> 50183


public class reverseANumber {

    public static int reverse(int a) {
        int sum = 0;
        int i = 10;
        while (a != 0) {
            sum = sum * i + (a % 10);
            a = a / 10;

        }
        return sum;
    }

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }

}
