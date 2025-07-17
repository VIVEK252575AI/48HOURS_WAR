package DAY2.printing_pattern;

public class half_py {
    public static void main(String[] args) {
        int line = 4 ;

        for(int i=1; i<=line; i++){
           for(int star=1; star<=i; star++){
            System.out.print(star);
           }
           System.out.println();
        }
        
    }
}
