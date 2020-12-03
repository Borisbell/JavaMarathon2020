package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        System.out.println(Arrays.toString(numbers));
        int nMax = 0;
        int nMin = numbers[0];
        int elementsEndZero = 0;
        int sumElementsEndZero = 0;
        for (int n : numbers) {
            if (n > nMax) {
                nMax = n;
            }
            if (n < nMin) {
                nMin = n;
            }
            if (n % 10 == 0) {
                elementsEndZero++;
                sumElementsEndZero += n;
            }
        }
        System.out.println("Наибольший элемент массива: " + nMax);
        System.out.println("Наименьший элемент массива: " + nMin);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + elementsEndZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumElementsEndZero);
    }
}
