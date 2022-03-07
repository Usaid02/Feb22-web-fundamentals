package weekthird;

import java.util.Scanner;

public class PrintAsciiValue {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        ch = sc.next().charAt(0);
        int a = ch;

        System.out.println(a);
    }
}
