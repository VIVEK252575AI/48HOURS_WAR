package DAY2.printing_pattern.advance_pattern;
import java.util.*;

public class advance_pattern {

    public static void hollow_rectangle(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid_with_numbers(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zero_and_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int m) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) System.out.print(" ");
            for (int j = 1; j <= m; j++) 
                System.out.print((i == 1 || i == m || j == 1 || j == m) ? "*" : " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for hollow rectangle:");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns for hollow rectangle:");
        int b = sc.nextInt();
        hollow_rectangle(a, b);

        System.out.println("Enter the number for length of inverted rotated half pyramid:");
        int n = sc.nextInt();
        inverted_rotated_half_pyramid(n);

        System.out.println("Enter the number for length of inverted rotated half pyramid with numbers:");
        int x = sc.nextInt();
        inverted_rotated_half_pyramid_with_numbers(x);

        System.out.println("Enter the number of rows for Floyd's triangle:");
        int f = sc.nextInt();
        floyds_triangle(f);

        System.out.println("Enter the number of row for zero and one triangle:");
        int z = sc.nextInt();
        zero_and_one_triangle(z);

        System.out.println("Enter the number of rows for butterfly pattern:");
        int butterfly = sc.nextInt();
        printButterfly(butterfly);

        System.out.println("Enter the number of rows for hollow rhombus:");
        int m = sc.nextInt();
        hollowRhombus(m);
    }
}
