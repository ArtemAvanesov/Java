import java.util.Scanner;

public class Main {
    public  static  void main(String[] args){
        int a;
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("������� �����: ");
            a = in.nextInt();
            if (a <= 0) throw  new Exception();
           for(int i = 2; i <= Math.sqrt(a); i++)
           {
               if(a%i == 0) flag = true;
           }
            if(a == 2) flag = true;
        if(flag)
            System.out.println("����� " + a +" - ���������");
            else
            System.out.println("����� " + a +" - �������");
        }
        // ����� ����������
        catch (Exception e) {
            System.out.println("�� ����� ������������ ��������!");
        }
    }
}
