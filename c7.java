import java.util.Scanner;

// Java Program to Check Whether a Number is Even or Odd
public class c7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        String result = checkevenodd(num);
        System.out.println("The Given No. " + num + " is " + result);
    }

    public static String checkevenodd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
