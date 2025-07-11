import java.util.*;

// Area of a Square
public class area_of_sq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: "); // Added prompt
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of the square is: " + area);
    } // Added missing closing brace
} // Added missing closing brace