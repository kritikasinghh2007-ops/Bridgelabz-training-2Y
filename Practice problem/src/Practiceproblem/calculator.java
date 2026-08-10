package Practiceproblem;

import java.util.Scanner;

public class calculator {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        double base=sc.nextDouble();

        System.out.println("enter the exponent:");
        double exponent=sc.nextDouble();
        double result=Math.pow(base,exponent);

        System.out.println(base+"raised to the power"+exponent+"is:"+result);
    }
}
