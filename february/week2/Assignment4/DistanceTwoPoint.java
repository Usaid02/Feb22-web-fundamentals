package febweekfirst;

import java.util.Scanner;

public class DistanceTwoPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2;
        double dis;

        System.out.println("enter x1 point");

        x1=sc.nextInt();

        System.out.println("enter y1 point");

        y1=sc.nextInt();

        System.out.println("enter x2point");

        x2=sc.nextInt();

        System.out.println("enter y2 point");

        y2=sc.nextInt();

        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
