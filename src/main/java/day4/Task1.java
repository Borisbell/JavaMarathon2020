package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }
        System.out.println("Введено число " + n + ". Сгенерирован следующий массив: ");
        System.out.println(Arrays.toString(numbers));

        int numsGreaterEight = 0;
        int numsEqualsOne = 0;
        int numsEven = 0;
        int numsOdd = 0;
        int sumAllElements = 0;

        for (int x : numbers) {
            sumAllElements += x;
            if (x > 8) {
                numsGreaterEight++;
            }
            if (x == 1) {
                numsEqualsOne++;
            }
            if (x % 2 == 0) {
                numsEven++;
            } else {
                numsOdd++;
            }
        }
        System.out.println("Длина масива:" + numbers.length);
        System.out.println("Количестве чисел больше 8: " + numsGreaterEight);
        System.out.println("Количестве чисел равных 1: " + numsEqualsOne);
        System.out.println("Количестве четных чисел: " + numsEven);
        System.out.println("Количестве нечетных чисел: " + numsOdd);
        System.out.println("Сумме всех элементов массива: " + sumAllElements);

    }
}
