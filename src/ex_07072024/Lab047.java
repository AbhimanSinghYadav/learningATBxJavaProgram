package ex_07072024;

import java.util.Locale;

public class Lab047 {
    public static void main(String[] args) {
        String password ="Pramod@123";
        String pass_u=password.toLowerCase();
        System.out.println(pass_u);
        //pass_u ==password
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Pramod@123 =pramod@123 =pramOD@123
       // OUTPUT pramod@123
        //false
        //false
        //true
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("d"));
                System.out.println(password.length());
        //Pra
        //1
    }
}
