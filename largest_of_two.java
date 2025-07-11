
import java.util.*;

public class largest_of_two {
    public static void main(String[] args) {  // "String" must be capitalized
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.print("a is greatest than b");  // Removed s:
        }
        else if (b > a) {
            System.out.print("b is greatest than a");
        }
        else {
            System.out.print("Both numbers are equal");
        }
    }  // Added missing closing brace
}