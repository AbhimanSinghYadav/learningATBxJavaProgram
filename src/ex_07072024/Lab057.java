package ex_07072024;

import java.util.Scanner;

public class Lab057 {
    public static void main(String[] args) {
        //max no in two inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int num1= sc.nextInt();

        System.out.println("enter the no");
        int num2= sc.nextInt();
       // System.out.println(Math.max(num1,num2));

        if(num1>num2) {
            System.out.println(num1);
        }
        else if(num2>num1) {
            System.out.println(num2);
        }
        else {
            System.out.println("equal");
        }
    }
}
