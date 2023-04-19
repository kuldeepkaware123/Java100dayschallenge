import java.util.Scanner;

// Java Program to Multiply two Floating Point Numbers

public class c3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter The First Float No.");
        float num1 = number.nextFloat();
        System.out.println("Enter The Secound Float No.");
        float num2 = number.nextFloat();
        float mul = num1 * num2;
        System.out.println("Answer : "+ mul);
        
    }
}