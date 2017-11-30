import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        double a,b,c;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите длину первой строноны. a = ");
            a = in.nextDouble();
            if (a <= 0) throw  new Exception();
            System.out.print("Введите длину второй строноны. b = ");
            b = in.nextDouble();
            if (b <= 0) throw  new Exception();
            System.out.print("Введите длину третьей строноны. c = ");
            c = in.nextDouble();
            if (c <= 0) throw  new Exception();
            // Треугольник можно составить только в том случае, когда сумма
            // длин любых двух сторон больше длины третьей стороны
        if(a >= b + c || b >= a + c || c >= a + b)
           System.out.println("К сожалению, треугольника не получится...");
            else  System.out.println("Из этих линий можно составить треугольник!");
        }
        // Отлов исключений
        catch (Exception e) {
            System.out.println("Это не длина отрезка!");
        }
    }
}