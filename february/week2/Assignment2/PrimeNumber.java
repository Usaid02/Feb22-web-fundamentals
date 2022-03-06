package febweekfirst;
//                                    Prime Number
    import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean count = false;
        for (int i = 2; i <= n / 2; ++i) {

            if (n % i == 0) {
                count = true;
                break;
            }
        }

        if (!count) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

