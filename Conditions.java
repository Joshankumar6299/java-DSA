
import java.util.Scanner;

public class Conditions{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

        // System.out.print("Enter the first number (a): ");
        // double a =sc.nextDouble();

        // System.out.print("Enter the second number (b): ");
        // double b = sc.nextDouble();

       
        

        // if (age > 18) {
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Child");
        // }

        // if (x % 2 == 0) {
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        // if (a == b) {
        //     System.out.println("Equal");
        // }
        // else if (a > b) {
        //     System.out.println("A is  greater");
        // }
        // else{
        //     System.out.println("A is lesser");
        // }


        // if(button == 1) {
        //     System.out.println("Hello");
        // }
        // else if (button == 2) {
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("Invalid Button");
        // }


        // switch (button) {
        //     case 1 : System.out.println("Hello");
        //     break;
        //     case 2 : System.out.println("namaste");
        //     break;
        //     case 3 : System.out.println("Bonjour");
        //     break;
        
        //     default:System.out.println("Invalid Button");
        //         break;
        // }


       

    //    System.out.println("Enter operation(1-5):");
    //    int operation = sc.nextInt();

    //    switch (operation) {
    //        case 1:
    //        System.out.println(a+b);
    //            break;
    //         case 2:
    //         System.out.println(a-b);
    //             break;
    //         case 3:
    //         System.out.println(a*b);
    //            break;
    //         case 4:
    //         System.out.println(a/b);
    //            break;
    //         case 5:
    //         System.out.println(a%b);
    //            break;
    //        default:
    //            System.out.println("Error: Invalid Operation");
    //    }

    System.out.print("Enter operation(1-12):");
       int months = sc.nextInt();

    switch (months) {
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("Jun");
            break;
        case 7:
            System.out.println("July");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("October");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("Error: Invalid number");
         }
    }
}
