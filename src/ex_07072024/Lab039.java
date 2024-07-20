package ex_07072024;

public class Lab039 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45F;
        //int total_price=course+GST;//implicit narrowing
        int total_price = course + (int) GST;//explicit narrowing-real time money loss
        System.out.println(total_price);//118

        //float total_price=course+(int)GST 118.45
    }
}
