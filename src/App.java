import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        {
            n = sc.nextInt();
            while (n != 0) {
                n = n / 10;
                count = count + 1;
            }
            System.out.println(count);
        }
        sc.close() ;
    }

}
