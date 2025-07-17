package DAY2.printing_pattern.function;

public class Binary_decimel {

    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int base = 1; // 2^0

        while (binary > 0) {
            int lastDigit = binary % 10;
            binary = binary / 10;
            decimal += lastDigit * base;
            base *= 2; // Increase the base by a factor of 2
        }
        return decimal;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binary = sc.nextInt();
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal equivalent of binary " + binary + " is: " + decimal);
        
    }
}
