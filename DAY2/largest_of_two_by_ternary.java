package DAY2;

import java.util.*;

public class largest_of_two_by_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = (a > b) ? "a is large" : "b is large";
        System.out.println(result);
    }
}