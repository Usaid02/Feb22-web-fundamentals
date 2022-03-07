package weekthird;
import java.util.Scanner;
public class ProductOfIntDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input integer: ");
        int a = sc.nextInt();
        System.out.print("Input decimal: ");
        float b = sc.nextFloat();
        float product = a * b;
        System.out.println(product);
    }
}
