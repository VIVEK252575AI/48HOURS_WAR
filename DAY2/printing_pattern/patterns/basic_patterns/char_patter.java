package DAY2.printing_pattern;

public class char_patter {
    public static void main(String[] args) {
        int line =4;
        char ch= 'A' ;
        for(int i=1; i<=line; i++){
            for(int chars=1; chars<=i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
