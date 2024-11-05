import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: "); // Prompt before reading input
        // String name = sc.next();
        // System.out.println("Your name is: " + name);
        // sc.close(); // Close the scanner/


        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}
