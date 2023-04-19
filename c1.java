// Challenge 1 : Java Program to Print an Integer (Entered by the User)
import java.util.*;
public class c1{
    public static void main(String a[]){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter The Integer");
        int num = number.nextInt();
        System.out.println("You Enter : " + num);
    }
}
