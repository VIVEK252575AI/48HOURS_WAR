package DAY2.printing_pattern.function;
import java.util.Scanner;

public class BionomicalCofficient {


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
        int r = sc.nextInt();
        int result = fact(n) / (fact(r) * fact(n - r));
        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
    }

}

