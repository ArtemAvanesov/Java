import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
       String [] array1 = {"a","c","e","g","i","k","m","o","q","s","u","w","y"};
       String [] array2 = {"b","d","f","h","j","l","n","p","r","t","v","x","z"};
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите число: ");
            int a = in.nextInt();
            if (a <= 0) throw  new Exception();
            if (array1.length < a || array2.length < a) throw  new NullPointerException();
            String [] array3 = new String[2*a];
            for(int i = 0; i < 2*a; i++)
            {if(i<a)
                array3[i] = array1[i];
                else array3[i] = array2[i-a];
            }
            Arrays.sort(array3);
            //Вывод полученного массива
        for(String s: array3)
            System.out.print(s + ' ');
        }
        // Отлов исключений
        catch (NullPointerException e) {System.out.println("Массив содержит меньше элементов, чем вы хотите!");}
        catch (Exception e) {
            System.out.println("Введено недопустимое значение!");
        }
    }
}