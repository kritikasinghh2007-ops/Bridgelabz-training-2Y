package Practiceproblem;

import java.util.Scanner;

public class Average {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number:");
        int num1=sc.nextInt();

        System.out.println("enter second number:");
        int num2=sc.nextInt();

        System.out.println("enter third number:");
        int num3=sc.nextInt();

        int average=(num1+num2+num3)/3;

        System.out.println("the average of three numbers is:"+average);
    }
}
