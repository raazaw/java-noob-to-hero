import java.util.*;
// Write a function that accepts a character and prints if it is “Uppercase” or “Lowercase”.

public class question3 {
    public static void checkCase(char chrr) {
        int ascii = chrr;
        // You can also cast char to int
        // int castAscii = (int) chrr;
        if (ascii >= 65 && ascii <= 90) {
            System.out.println("uppercase");

        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("lowercase");
        } else {
            System.out.println("invalid character");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        checkCase(chr);
        sc.close();

    }

}
