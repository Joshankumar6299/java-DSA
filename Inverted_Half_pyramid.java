public class Inverted_Half_pyramid {
    
    public static void main(String[] args) {
        // Q4 Inverted Half Pyramid
        // ****
        // ***
        // **
        // *
        int n=4;

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
