package febweeksecond;
                                        // Print Pyramid Pattern
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
              // space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
                //1st half numbers
            for (int j=i; j>=1; j--){
                System.out.print("*");
            }
               // 2nd half numbers
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
