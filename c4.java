import java.util.Scanner;

// Java Program to Find ASCII Value of a character

public class c4 {
    public static void main(String[] args) {
        Scanner charater = new Scanner(System.in);
        System.out.println("Please Enter any Charecter : ");
        char ch = charater.next().charAt(0);
        System.out.println("You Entered : " + ch);
    }
}
