package DAY2;


public class squarprint {
    public static void main(String[] args) {
        // Print a square pattern of asterisks
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= 4; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}