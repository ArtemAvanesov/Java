import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        double a,b,c;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("������� ����� ������ ��������. a = ");
            a = in.nextDouble();
            if (a <= 0) throw  new Exception();
            System.out.print("������� ����� ������ ��������. b = ");
            b = in.nextDouble();
            if (b <= 0) throw  new Exception();
            System.out.print("������� ����� ������� ��������. c = ");
            c = in.nextDouble();
            if (c <= 0) throw  new Exception();
            // ����������� ����� ��������� ������ � ��� ������, ����� �����
            // ���� ����� ���� ������ ������ ����� ������� �������
        if(a >= b + c || b >= a + c || c >= a + b)
           System.out.println("� ���������, ������������ �� ���������...");
            else  System.out.println("�� ���� ����� ����� ��������� �����������!");
        }
        // ����� ����������
        catch (Exception e) {
            System.out.println("��� �� ����� �������!");
        }
    }
}