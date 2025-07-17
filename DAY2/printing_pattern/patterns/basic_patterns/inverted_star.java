package DAY2.printing_pattern;

public class inverted_star {
    public static void main(String[] args) {
        int n = 4 ;

        for (int line =1; line<=n; line++){
            for (int s=1; s<=(n-line)+1; s++)
                System.out.print("*");
            System.out.println();
        }
        
    }
    
}