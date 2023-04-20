import java.util.Scanner;

// Java Program to Find the Largest Among Three Numbers
public class c9 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Three No. ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int largest_num = Math.max(a, Math.max(b,c));
    System.out.println("The Largest Num is : " + largest_num);
   } 
}
