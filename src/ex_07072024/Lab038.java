package ex_07072024;

public class Lab038 {
    public static void main(String[] args) {
        //widening
        byte b=10;
        int a=b;  //Valid-implicit casting-JVM
        int a1=(int)b;  //Valid-explicit casting
        //Narrowing
        int val =300;
        //byte b1=val;  //Invalid-implicit casting-JVM
        byte b1=(byte)val;//invalid -Explicit casting
        System.out.println(b1);

    }
}
