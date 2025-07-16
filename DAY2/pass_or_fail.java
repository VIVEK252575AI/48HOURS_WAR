package DAY2;

import java.util.*;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage");
            return;
        }
        String result = (percentage > 33) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
