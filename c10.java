
// Java Program to Find all Roots of a Quadratic Equation
import java.util.*;

public class c10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Three No. ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double root1, root2, root, imagenary;

        double determine = Math.pow(b, 2) - 4 * a * c; // b2-4ac
        System.out.println(determine);
        if (determine > 0) {
            root1 = (-b + Math.sqrt(determine)) / (2 * a); // -b + sqrt (b2-4ac) / 2a
            root2 = (-b - Math.sqrt(determine)) / (2 * a); // -b - sqrt (b2-4ac) / 2a
            System.out.println("Root1 : " + root1 + " Root2 : " + root2);
        } else if (determine == 0) {
            root = root1 = root2 = -b / (2 * a); // -b/2a
            System.out.println("Root : " + root);
        } else {
            double real = -b / (2 * a);
            imagenary = Math.sqrt(-determine) / (2 * a); // sqrt (b2-4ac)/2a
            System.out.println("Real : " + real + " imagenary : " + imagenary);
        }
    }
}
