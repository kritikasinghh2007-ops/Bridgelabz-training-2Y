package Practiceproblem;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter length:");
        int length=sc.nextInt();
        System.out.println("enter breadth");
        int breadth=sc.nextInt();


        int perimeter=2*(length+breadth);
        System.out.println("perimeter of rectangle="+perimeter);
    }
}
