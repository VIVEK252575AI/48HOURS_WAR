package DAY1;

import java.util.*;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the value of radius:");
        int r = sc.nextInt();

        float areaOfCircle = 3.14f * r * r;
        System.out.println("Area of circle is: " + areaOfCircle);
    }
}
