package ex_07072024;

public class Lab040 {
    public static void main(String[] args) {
        //pre increment ,post increment
        int a=10;
        System.out.println(++a + ++a);
        System.out.println(a);
        //A -> ++a,Exp=11 | a=11
        //+ -> nothing
        // B -> ++a Exp=12 | a=12
        //Exp=A+B =23, a=12
        //a--  --a
        System.out.println(++a + a++ + a++);
    }
}

