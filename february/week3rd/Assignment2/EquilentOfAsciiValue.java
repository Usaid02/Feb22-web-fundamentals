package weekthird;

import java.util.Scanner;

public class EquilentOfAsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter the value");
        ch = sc.next().charAt(0);
        int equilent = ch + 3;
        System.out.println(equilent);
    }
}
