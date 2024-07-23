package ex_07072024;

import java.util.Scanner;

public class Lab060 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day");
        int day= sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:

                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thru");
                break;
            default:
                System.out.println("no idea");
                break;
        }
        System.out.println("out of loop");




        }
    }



