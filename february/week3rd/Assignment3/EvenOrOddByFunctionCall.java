package weekthird;

import java.util.Scanner;

public class EvenOrOddByFunctionCall {
    public static void EvenOdd(int n){
        if(n % 2== 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        EvenOdd(n);
    }
}
