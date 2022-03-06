package febweekfirst;
                                            // print multiplication of a table
import java.util.*;
public class MultipicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n = sc.nextInt();
        System.out.println("Enter the second number");
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            System.out.println(n + "*"  + i + "=" + n * i);
        }

    }
}
