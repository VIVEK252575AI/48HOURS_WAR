package DAY2.printing_pattern.function;

import java.util.Scanner;
public class factorial {

    public static int fact(int n ) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }   
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }

}