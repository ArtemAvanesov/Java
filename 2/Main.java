import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        int a;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter the num: ");
            a = in.nextInt();
            if (a <= 0) throw  new Exception();
           for(int i = 2; i <= Math.sqrt(a); i++)
           {
               if(a%i == 0) flag = true;
           }
            if(a == 2) flag = true;
        if(flag)
            System.out.println("Num " + a +" is compound number");
            else
            System.out.println("Num " + a +" is prime number");
        }
        // Catch exceptions
        catch (Exception e) {
            System.out.println("Incorrect data!");
        }
    }
}
