package DAY2;

import java.util.Scanner;

public class fever {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp>100){
            System.out.println("Youhaveafever");
        }else{
           System.out.println("chill bro "); 
        }
    }   

        
}
