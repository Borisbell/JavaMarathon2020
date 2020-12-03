package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        //размеры массива
        int rows = 8;
        int columns = 12;

        //заполняем массив
        int[][] x = new int[rows][columns];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = rand.nextInt(50);
            }
        }

        //Вывод массива
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }

        //поиск макс строки
        int line = 0;
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            int maxRow = 0;
            for (int j = 0; j < x[i].length; j++) {
                maxRow += x[i][j];
            }
            if (maxRow >= temp) {
                temp = maxRow;
                line = i;
            }
        }
        System.out.println("");
        System.out.println("Индекс строки: " + line + ". Сумма элементов строки: " + temp);
    }
}
