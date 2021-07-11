import java.util.*;

// 2. Write a program that takes two numbers ‘n1’ & ‘n2’ and a character ‘ch’ as input.
// - If ch = ‘*’ returns multiplication of the numbers
// - If ch = ‘/’ returns quotient after division of the numbers
// - If ch = ‘%’ returns remainder after division of the numbers
// - If ch = ‘+’ returns addition of the numbers
// - If ch = ‘-’ returns subtraction of the numbers

class question2 {
    public static int calculate(int[] numbers, String Character) {
        switch (Character) {
            case "+":
                return numbers[0] + numbers[1];
            case "-":
                return numbers[1] - numbers[0];
            case "*":
                return numbers[1] * numbers[0];
            case "/":
                return numbers[1] / numbers[0];

            default:
                return -1;

        }

    }

    public static void main(String[] args) {

        int[] num = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the operator");
        String ch = sc.nextLine();
        for (int i = 0; i < 2; i++) {
            System.out.println("input a number");
            num[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(calculate(num, ch));

    }
}