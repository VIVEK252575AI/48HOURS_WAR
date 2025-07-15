package DAY2;
import java.util.Scanner;
public class reverse_of_a_num {
    public static void main(String[] args) {
        // Reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit from num
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
