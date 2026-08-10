package Practiceproblem;

import java.util.Scanner;

public class Conversion1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter distance in kilometer");
        double kilometer=sc.nextDouble();
        double miles=kilometer*.621371;
        System.out.println("distance in miles:"+miles);
    }
}
