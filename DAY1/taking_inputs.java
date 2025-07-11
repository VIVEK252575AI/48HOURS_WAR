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




📥 Input Methods in Java using Scanner

1️⃣ next()
   ➤ Takes a single word (no spaces)
   Example:
       String name = sc.next();

2️⃣ nextLine()
   ➤ Takes the entire line including spaces
   Example:
       String sentence = sc.nextLine();

3️⃣ nextInt()
   ➤ Takes integer input
   Example:
       int age = sc.nextInt();

4️⃣ nextByte()
   ➤ Takes byte input (-128 to 127)
   Example:
       byte smallNum = sc.nextByte();

5️⃣ nextFloat()
   ➤ Takes float input (e.g., 3.14f)
   Example:
       float marks = sc.nextFloat();

6️⃣ nextDouble()
   ➤ Takes double input (more precision than float)
   Example:
       double pi = sc.nextDouble();

7️⃣ nextBoolean()
   ➤ Takes boolean input (true/false)
   Example:
       boolean isJavaFun = sc.nextBoolean();

8️⃣ nextShort()
   ➤ Takes short input (-32,768 to 32,767)
   Example:
       short s = sc.nextShort();

9️⃣ nextLong()
   ➤ Takes long input (for very large numbers)
   Example:
       long bigNumber = sc.nextLong();
*/
