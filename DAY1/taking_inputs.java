package DAY1;
import java.util.*;

public class taking_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);

       
    }
}

/*
💡 If you want to take an entire line of input (including spaces) into a String or any data type, 
you can use the `nextLine()` method of the Scanner class.

✅ Example:
If you want to take input into a String and allow multiple words or a full sentence:
    String name = sc.nextLine();

⚠️ Important:
- The method name is `nextLine()` — with a capital 'L'.
- The data type should be written with the first letter **capitalized**, like `String`, not `string`.

❌ Incorrect:
    string name = sc.nextlineString();  // ❌ wrong syntax, wrong method

✅ Correct:
    String name = sc.nextLine();        // ✔️ correct usage

    
*/
