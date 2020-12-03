package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(numbers));

        //поиск максимальной тройки чисел
        int temp = 0;
        int index = 0;
        int[] maxThreesome = new int[3];
        for (int i = 1; i < numbers.length - 1; i++) {
            int sum = numbers[i] + numbers[i - 1] + numbers[i + 1];
            if (sum > temp) {
                temp = sum;
                index = i - 1;
                maxThreesome[0] = numbers[i - 1];
                maxThreesome[1] = numbers[i];
                maxThreesome[2] = numbers[i + 1];
            }
        }
        System.out.println("Сумма = "+temp+". Индекс: "+index +". Тройка чисел: "+Arrays.toString(maxThreesome));
    }
}

