package DAY2;

import java.util.*;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percentage = sc.nextInt();
        String result = (percentage > 33) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
