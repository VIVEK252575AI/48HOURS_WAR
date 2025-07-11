package DAY1;

import java.util.*;

// Bill of Items
public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of pencil: "); // Added prompt
        float pencil = sc.nextFloat();
        System.out.print("Enter price of pen: "); // Added prompt
        float pen = sc.nextFloat();
        System.out.print("Enter price of eraser: "); // Added prompt
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill before tax: " + total);

        // Add on - with 18% tax
        float newTotal = total + (0.18f * total);
        System.out.println("Bill after 18% tax: " + newTotal); // Added missing print
    } // Added missing closing brace
} // Added missing closing brace