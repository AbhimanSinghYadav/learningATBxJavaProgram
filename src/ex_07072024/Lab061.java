package ex_07072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the browser name");
            String browsername= sc.next();
            browsername =browsername.toLowerCase();
            switch (browsername){
                case "chrome":
                    System.out.println("chrome");
                    break;
                case "firefox":
                    System.out.println("friefox");
                    break;
                case "edge":
                    System.out.println("edge");
                    break;
                case "safari":
                    System.out.println("safari");
                    break;
            }

        }
    }
}
