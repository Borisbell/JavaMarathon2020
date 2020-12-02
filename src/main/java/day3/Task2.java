package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b = 1;
        while (b != 0) {
            //System.out.println("Введите числа");
            a = sc.nextDouble();
            b = sc.nextDouble();
            if(b == 0){
                break;
            }
            System.out.println(a/b);
        }
    }
}
