package ex_07072024;

public class Lab064 {
    public static void main(String[] args) {
        int item_code=007;
        switch (item_code){
            case 001,002,003 ->System.out.println("mechenical");
            case 004,005,006 ->System.out.println("electornic");
            default-> System.out.println("none");

        }
    }
}
