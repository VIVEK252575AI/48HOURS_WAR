package DAY2;

import java.util.Scanner;

public class printfor_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range (last number): ");
        int range = sc.nextInt();
        
        System.out.println("Enter starting number: ");
        int n = sc.nextInt();
        
        while (n <= range) {
            System.out.println(n);
            n++;
        }
    }
}