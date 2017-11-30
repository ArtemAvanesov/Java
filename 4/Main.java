public class Main {
    public static void main(String[] args) {

        int k = 1;

        // Заполнение массива
        int[][] array = new int[7][7];
        for(int i = 1; i <= 7; i++)
            if(i%2 == 0)
                for(int j = 1; j <= 7; j++)
                {array[i-1][j-1]=k; k++;}
            else
                for(int j = 7; j >= 1; j--)
                {array[i-1][j-1]=k; k++;}

        // Вывод массива
        for(int i = 1; i <= 7; i++)
        {System.out.println();
            for(int j = 1; j <= 7; j++)
                if(array[i-1][j-1] < 10)
                    System.out.print(" " + array[i-1][j-1] + " ");
                else System.out.print(array[i-1][j-1] + " ");}
    }
}