package ex_07072024;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int user_input= s.nextInt();
        System.out.println(user_input);

        if(user_input==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
