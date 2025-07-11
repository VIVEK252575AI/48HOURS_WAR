
/* Question1:In a program , input 3numbers :A , B and C.You have to output the average of these 3 numbers
(Hint : Average of N numbers is sum of those numbers divided by N) */ 



package DAY1;

import java.util.*;

public class Avg_of_3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("First number: " + a);
        int b = sc.nextInt();
        System.out.println("Second number: " + b);
        int c = sc.nextInt();
        System.out.println("Third number: " + c);

        double avg = (a + b + c) / 3.0;
        System.out.println("Average: " + avg);
    }
}