package ex_07072024;

public class Lab046 {
    public static void main(String[] args) {
        String name="The Testing Academy";//SCP
        String name1="The Testing Academy";//SCP
        //String name2=new String("The Testing Academy"); //Heap area
        //String name3=new String("The Testing Academy"); //Heap area
        System.out.println(name == name1); //Check for the Ref
        //output=true
        System.out.println(name.equals(name1)); //Check for the Content
    }

}
