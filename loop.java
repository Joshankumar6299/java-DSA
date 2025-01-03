
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // for(int i = 0; i < 11; i++) {
        //     System.out.print(i + " ");
        // }
    //    int n=11;
    //     for(int i = 0; i < n; i++) {
    //         System.out.print(i + " ");
    //     }

        // int i=0;
        // while (i<11){
        //     System.out.print(i + " ");
        //     i++;
        
        // }

        // int i=0;
        // do { 
        //     System.out.println(i);
        //     i++;
        // } while (i<11);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number: ");

        int n = sc.nextInt();
        
        // int sum = 0;
        // for (int i = 0; i <= n; i++) {
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        for(int i=1; i<11;i++){
            System.out.println(i*n);
        }

    }
}
