import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        double a,b,c;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the length of the first side. a = ");
            a = in.nextDouble();
            if (a <= 0) throw  new Exception();
            System.out.print("Enter the length of the second side. b = ");
            b = in.nextDouble();
            if (b <= 0) throw  new Exception();
            System.out.print("Enter the length of the third side. c = ");
            c = in.nextDouble();
            if (c <= 0) throw  new Exception();
            // A triangle can only be drawn up when the sum of the lengths
	    // of any two sides is greater than the length of the third side
        if(a >= b + c || b >= a + c || c >= a + b)
           System.out.println("Unfortunately, the triangle will not be built...");
            else  System.out.println("Using these lines you can make a triangle!");
        }
        // Catch exceptions
        catch (Exception e) {
            System.out.println("This is not the length!");
        }
    }
}