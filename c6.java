// Java Program to Swap Two Numbers
public class c6 {
   public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println("Besfor Swap Value");
    System.out.println("a = " + a + " b = " + b);
    System.out.println("after Swap Value");
    swapping(a, b);

   } 
   public static void swapping(int x , int y){
    x = x+y;
    y = x-y;
    x = x-y;
    System.out.println("a = " + x + " b = " + y);

   }
}
