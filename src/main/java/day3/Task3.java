package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (counter < 5) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
            counter++;
        }
    }
}
