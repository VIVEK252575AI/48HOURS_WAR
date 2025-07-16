package DAY2.printing_pattern;

import java.util.Scanner;
public class nested_loop_star_pattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int line = sc.nextInt();
         for (int i=1; i<=line; i++) {
             for (int star=1; star<=i; star++){
                 System.out.print("*");

             }
             System.out.println();

          
         }
    }
}
