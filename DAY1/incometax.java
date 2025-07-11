package DAY1;
import java.util.*;

public class incometax {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);  // 20% tax
        }
        else {
            tax = (int) (income * 0.3);  // 30% tax (FIXED: Added missing logic)
        }

        System.out.println("Your tax is: " + tax);
    }
}