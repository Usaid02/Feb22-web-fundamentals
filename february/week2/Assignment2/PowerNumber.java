package febweekfirst;
import java.util.*;
//                                        power of a number
public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                // declare variable
        int n,p,result=1;
//                                take the user input
        System.out.println("Enter the number");
        n = sc.nextInt();
//                                take the user input
        System.out.println("Enter the power");
        p = sc.nextInt();
//                                  use method
        for(int i=1; i<=p; i++){
            result = n * result;
        }
        System.out.println("power is " + result);
    }
}
