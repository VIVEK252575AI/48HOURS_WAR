package DAY2;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true ;
        for (int i =2 ; i <= maths.sqrt(n) ; i++) {
            if (n % i == 0) {
                isprime = false ;
                break ;
            }
        }
      
        if (isprime && n > 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
    
}
