package ex_07072024;

public class Lab063 {
    public static void main(String[] args) {
        int item_code=007;
        switch (item_code){
            case 001,002,003:
                System.out.println("mechenical");
                break;
            case 004,005,006:
                System.out.println("electornic");
                break;
            default:
                System.out.println("none");

        }
    }
}
