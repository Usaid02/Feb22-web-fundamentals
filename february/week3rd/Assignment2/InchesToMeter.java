package weekthird;

import java.util.Scanner;

public class InchesToMeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a value for inch");
        double inch = sc.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
