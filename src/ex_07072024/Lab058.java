package ex_07072024;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the input");
        int score=sc.nextInt();
        char grade='f';
        if(score>=90 && score<=100) {
            grade='a';
        }
            else if(score>=80 && score<=89)
            {
            grade = 'b';
        }
                  else if(score>=80 && score<=89)
                  {
            grade = 'c';
                  }
        else if(score>=00 || score<=100) {
            System.out.println("god");
        }
                  else {
                      grade='f';
            System.out.println("your grade is"+grade);
            sc.close();

        }
        }
        }
